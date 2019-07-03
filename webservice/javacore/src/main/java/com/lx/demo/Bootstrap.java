package com.lx.demo;

import javax.xml.ws.Endpoint;

/**
 * 发布 webservice
 * 查看wsdl文件: http://127.0.0.1:8080/hello?wsdl
 * <!--
 *  Published by JAX-WS RI (http://jax-ws.java.net). RI's version is JAX-WS RI 2.2.9-b130926.1035 svn-revision#5f6196f2b90e9460065a4c2f4e30e065b245e51e.
 * -->
 * <!--
 *  Generated by JAX-WS RI (http://jax-ws.java.net). RI's version is JAX-WS RI 2.2.9-b130926.1035 svn-revision#5f6196f2b90e9460065a4c2f4e30e065b245e51e.
 * -->
 * <definitions xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" xmlns:wsp="http://www.w3.org/ns/ws-policy" xmlns:wsp1_2="http://schemas.xmlsoap.org/ws/2004/09/policy" xmlns:wsam="http://www.w3.org/2007/05/addressing/metadata" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://demo.lx.com/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns="http://schemas.xmlsoap.org/wsdl/" targetNamespace="http://demo.lx.com/" name="SayHelloImplService">
 *
 * <types>
 * <xsd:schema>
 * <xsd:import namespace="http://demo.lx.com/" schemaLocation="http://127.0.0.1:8080/hello?xsd=1"/>
 * </xsd:schema>
 * </types>
 *
 * <message name="sayHello">
 * <part name="parameters" element="tns:sayHello"/>
 * </message>
 * <message name="sayHelloResponse">
 * <part name="parameters" element="tns:sayHelloResponse"/>
 * </message>
 *
 * <portType name="SayHelloImpl">
 * <operation name="sayHello">
 * <input wsam:Action="http://demo.lx.com/SayHelloImpl/sayHelloRequest" message="tns:sayHello"/>
 * <output wsam:Action="http://demo.lx.com/SayHelloImpl/sayHelloResponse" message="tns:sayHelloResponse"/>
 * </operation>
 * </portType>
 *
 * <binding name="SayHelloImplPortBinding" type="tns:SayHelloImpl">
 * <soap:binding transport="http://schemas.xmlsoap.org/soap/http" style="document"/>
 * <operation name="sayHello">
 * <soap:operation soapAction=""/>
 * <input>
 * <soap:body use="literal"/>
 * </input>
 * <output>
 * <soap:body use="literal"/>
 * </output>
 * </operation>
 * </binding>
 *
 * <service name="SayHelloImplService">
 * <port name="SayHelloImplPort" binding="tns:SayHelloImplPortBinding">
 * <soap:address location="http://127.0.0.1:8080/hello"/>
 * </port>
 * </service>
 * </definitions>
 */
public class Bootstrap {

    public static void main(String[] args) {
        //基于http协议
        Endpoint endpoint = Endpoint.publish("http://localhost:8080/hello", new SayHelloImpl());
        System.out.println("publish success");
    }
}
