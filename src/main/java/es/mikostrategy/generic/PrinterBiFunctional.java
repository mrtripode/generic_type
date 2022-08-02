package es.mikostrategy.generic;

import static java.text.MessageFormat.format;
import java.util.function.BiFunction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public interface PrinterBiFunctional<T, V, R> extends BiFunction<T, V, R> {

    final Logger logger = LogManager.getLogger(PrinterBiFunctional.class);

    public static PrinterBiFunctional print() {
        return (value, line) -> {
            var messageFormat = format("{0}, {1}", value, line);
            logger.info(messageFormat);
            return value;
        };
    } 

}
