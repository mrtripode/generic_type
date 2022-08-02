package es.mikostrategy.generic;

import static java.text.MessageFormat.format;

import java.util.function.Consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface PrinterConsumer<T> extends Consumer<T> {

    final Logger logger = LogManager.getLogger(PrinterConsumer.class);

    public static PrinterConsumer print() {
        return value -> {
            var messageFormat = format("{0}", value);
            logger.info(messageFormat);
        };
    }

}