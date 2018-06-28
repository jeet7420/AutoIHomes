package com.autoihomes;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
/**
 * Created by smarhas on 12/25/2017.
 */

public class TestMQTT {
    MemoryPersistence persistence = new MemoryPersistence();
    MqttClient client;
    public void doDemo(String topic,String status,String deviceId, String securityToken) {
        try {
            client = new MqttClient("tcp://101.53.145.48:8080", topic, persistence);
            if(client!=null && topic!=null && persistence!=null){
                client.connect();
                MqttMessage message = new MqttMessage();
                message.setPayload((securityToken+"-"+deviceId+status).getBytes());
                client.publish(topic, message);
                client.disconnect();
            }
        } catch (MqttException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}