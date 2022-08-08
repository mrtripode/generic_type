package es.mikostrategy.generic;

import static java.text.MessageFormat.format;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public record Printer<T> (T value) {

    private static final Logger LOGGER = LogManager.getLogger(Printer.class);

    public void print() {
        var messageFormat = format("{0}", value);
        LOGGER.info(messageFormat);
    } 

}
