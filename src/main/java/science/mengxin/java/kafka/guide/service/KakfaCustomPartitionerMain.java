package science.mengxin.java.kafka.guide.service;

import static science.mengxin.java.kafka.guide.KafkaGuideConst.KAFKA_SERVER_URL;

public class KakfaCustomPartitionerMain {
    public static void main(String[] args) {

        String brokers = KAFKA_SERVER_URL;
        String groupId = "group01";
        String topic = "UserMessageTopic";

        if (args != null && args.length == 3) {
            brokers = args[0];
            groupId = args[1];
            topic = args[2];
        }

        // Start User Producer Thread
        UserProducerThread producerThread = new UserProducerThread(brokers, topic);
        Thread t1 = new Thread(producerThread);
        t1.start();

        // Start group of User Consumer Thread
        UserConsumerThread consumerThread = new UserConsumerThread(brokers, groupId, topic);
        Thread t2 = new Thread(consumerThread);
        t2.start();

        try {
            Thread.sleep(100000);
        } catch (InterruptedException ie) {

        }
    }
}
