package es.mikostrategy.generic;

import static java.text.MessageFormat.format;

import java.util.function.BiConsumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public interface PrinterBiConsumer<T, V> extends BiConsumer<T, V> {

    public static <T, V> PrinterBiConsumer<T, V> print() {
        return (value, line) -> {
            final Logger logger = LogManager.getLogger(PrinterBiConsumer.class);
            var messageFormat = format("{0}, {1}", value, line);
            logger.info(messageFormat);
        };
    }

}
