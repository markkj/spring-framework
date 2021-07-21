package com.spring.basic.hellospringbasic01.xml;



public class XmlPersonDAO {

    XmlPersonDAO jdbcConnection;

    public XmlPersonDAO getXmlJdbcConnection() {
        return jdbcConnection;
    }

    public void setXmlJdbcConnection(XmlPersonDAO jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
