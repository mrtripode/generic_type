package es.mikostrategy.generic;

import static java.text.MessageFormat.format;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Printer<T> {

    private static final Logger LOGGER = LogManager.getLogger(Printer.class);
    private T value;

    public Printer(T value) {
        this.value = value;
    }

    public void print() {
        var messageFormat = format("{0}", value);
        LOGGER.info(messageFormat);
    } 

}
