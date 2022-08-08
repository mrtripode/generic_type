package es.mikostrategy.generic;

import static java.text.MessageFormat.format;
import java.util.function.Function;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public interface PrinterFunctional<T, R> extends Function<T, R> {

    final Logger logger = LogManager.getLogger(PrinterFunctional.class);

    public static PrinterFunctional print() {
        return value -> {
            var messageFormat = format("{0}", value);
            logger.info(messageFormat);
            return value;
        };
    }

}