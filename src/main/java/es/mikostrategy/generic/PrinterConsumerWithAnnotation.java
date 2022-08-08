package es.mikostrategy.generic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@FunctionalInterface
public interface PrinterConsumerWithAnnotation<T>  {
    
    final Logger logger = LogManager.getLogger(PrinterConsumerWithAnnotation.class);

    public static PrinterConsumerWithAnnotation print() {
        return value -> {
            logger.info(value);
            return value;
        };
    }

    T accept(T t);

}