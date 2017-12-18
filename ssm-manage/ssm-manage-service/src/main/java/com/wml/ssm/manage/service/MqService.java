package com.wml.ssm.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.*;

/**
 * Created by user on 2017/12/18.
 */
@Service
public class MqService {
    @Autowired
    JmsTemplate someoneJmsTemplate;
    @Autowired
    Destination someDestination;

    /**
     * 发送消息
     * @param info
     * @return
     */
    public String sendMq(final String info) {
        MessageCreator messageCreator = new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                TextMessage message = session.createTextMessage(info);
                return message;
            }
        };
        someoneJmsTemplate.send(this.someDestination, messageCreator);
        return "success";
    }
    /**
     * 接收消息
     * @param
     * @return
     */
    public String receiveMq() {
        try {
            TextMessage txtmsg = (TextMessage) someoneJmsTemplate.receive(someDestination);
            if (null != txtmsg) {
                System.out.println("DB Proxy: " + txtmsg);
                System.out.println("DB Proxy Message: " + txtmsg.getText());
            }
        } catch (JmsException e) {
            e.printStackTrace();
        } catch (JMSException e) {
            e.printStackTrace();
        }

        return "success";

        /*
        * output：
        * DB Proxy: ActiveMQTextMessage {commandId = 5, responseRequired = false, messageId = ID:GeekWang-54950-1513583601797-0:0:1:1:1, originalDestination = null, originalTransactionId = null, producerId = ID:GeekWang-54950-1513583601797-0:0:1:1, destination = queue://queue.wml.notice, transactionId = null, expiration = 0, timestamp = 1513583602167, arrival = 0, brokerInTime = 1513583602168, brokerOutTime = 1513586288419, correlationId = null, replyTo = null, persistent = true, type = null, priority = 4, groupID = null, groupSequence = 0, targetConsumerId = null, compressed = false, userID = null, content = null, marshalledProperties = null, dataStructure = null, redeliveryCounter = 0, size = 0, properties = null, readOnlyProperties = true, readOnlyBody = true, droppable = false, text = 将此消息推送到mq中。。。}
          DB Proxy Message: 将此消息推送到mq中。。。
        *
        * */
    }

}
