package es.mikostrategy.generic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@FunctionalInterface
public interface PrinterFunctionaWithAnnotation<T>  {
    
    final Logger logger = LogManager.getLogger(PrinterFunctionaWithAnnotation.class);

    public static<T> PrinterFunctionaWithAnnotation<T> print() {
        return value -> {
            logger.info(value);
            return value;
        };
    }

    T apply(T t);

}