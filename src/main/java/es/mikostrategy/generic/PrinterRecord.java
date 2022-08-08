package es.mikostrategy.generic;

import static java.text.MessageFormat.format;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public record PrinterRecord<T> (T text) {

    private static final Logger LOGGER = LogManager.getLogger(PrinterRecord.class);

    public void print() {
        var messageFormat = format("{0}", text);
        LOGGER.info(messageFormat);
    } 

}
