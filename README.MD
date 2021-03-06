# Learning Note


## Producer

### Serializers

#### Serializing Using Apache Avro

The book code missing a lot of code and configuration, and I use the Lenses Kafka to finish this part demo.

1. run lenses docker by compose: `./lenses-kafka.bat` or run the cmd in the file.
2. add scheme base on the `customer.avsc`


![lenses-scheme](doc/lenses-scheme.png)

3. add maven dependency `kafka-avro-serializer`
4. run the `mvn avro:scheme` generate `Customer.java`
5. run unit test : `send message with Avro`

# Note
```bash
docker run -e ADV_HOST=127.0.0.1 -e EULA="https://dl.lenses.stream/d/?id=91a1302c-7fef-490b-ae60-3c187a44e7f1" --rm -p 3030:3030 -p 9092:9092 -p 2181:2181 -p 8081: 8081 -p 9581:9581 -p 9582:9582 -p 9584:9584 -p 9585:9585 landoop/kafka-lenses-dev

docker stop jolly_davinci

```


Into Kafka Container

```bash
docker exec -it docker_lenses-kafka_1 /bin/bash
cd /opt/landoop/kafka/bin


docker exec -it docker_kafka1_1 /bin/bash
cd /opt/kafka/bin
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic guide --from-beginning
```


```bash
# ********************************************************************************
# You may visit http://127.0.0.1:3030 in about 45 seconds. Login with admin/admin.
# ********************************************************************************
# The services (kafka and lenses) need some time to start-up.
# The broker is accessible at PLAINTEXT://127.0.0.1:9092, Schema Registry at http://127.0.0.1:8081 and Zookeeper at 127.0.0.1:2181.
# For documentation please refer to -> https://lenses.stream/dev/lenses-box/
# If you have trouble running the image or want to give us feedback (or a rant), come chat with us at https://gitter.im/Landoop/support
```