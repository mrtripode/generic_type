package es.mikostrategy.generic;

import java.math.BigDecimal;
import java.util.function.Supplier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenericApplication {

	private static final Logger logger = LogManager.getLogger(GenericApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GenericApplication.class, args);

		runPrinter.get();
	}

	private static final Supplier<Void> runPrinter = () -> {
		final BigDecimal bd = BigDecimal.valueOf(1225.67);
		final String str = "String value";

		logger.info(">> Print with generic Printer without type dependency");
		getPrinter(str);

		logger.info(">> Class declare as record");
		getPrinterRecord(str);

		logger.info(">> Print with Printer Functional");
		getPrinterFunctional(bd, str);

		logger.info(">> Print with Printer BiFunctional");
		getPrinterBiFunctional(bd, str);

		logger.info(">> Print with Printer Consumer");
		getPrinterConsumer(bd, str);

		logger.info(">> Print with Printer BiConsumer");
		getPrinterBiConsumer(bd, str);

		logger.info(">> Print with Printer Functional With Annotation");
		getPrinterFunctionaWithAnnotation(bd, str);

		logger.info(">> Print with Printer Consumer With Annotation");
		getPrinterConsumerWithAnnotation(bd, str);

		return null;
	};

	private static void getPrinter(final String str) {
		final Printer<Integer> printerInt = new Printer<>(100);
		final Printer<Double> printerDouble = new Printer<>(98.89);
		final Printer<String> printerStr = new Printer<>(str);

		printerStr.print();
		printerDouble.print();
		printerInt.print();
	}

	private static void getPrinterRecord(final String str) {
		final PrinterRecord<Integer> printerRecordInt = new PrinterRecord<>(54);
		final PrinterRecord<String> printerRecordStr = new PrinterRecord<>(str);
		printerRecordInt.print();
		printerRecordStr.print();
	}

	private static void getPrinterFunctional(final BigDecimal bd, final String str) {
		PrinterFunctional.print().apply(100);
		PrinterFunctional.print().apply(99.89);
		PrinterFunctional.print().apply(bd);
		PrinterFunctional.print().apply(str);
	}

	private static void getPrinterBiFunctional(final BigDecimal bd, final String str) {
		PrinterBiFunctional.print().apply(100, 1);
		PrinterBiFunctional.print().apply(99.89, 2);
		PrinterBiFunctional.print().apply(bd, 3);
		PrinterBiFunctional.print().apply(str, 4);
	}

	private static void getPrinterConsumer(final BigDecimal bd, final String str) {
		PrinterConsumer.print().accept(100);
		PrinterConsumer.print().accept(99.89);
		PrinterConsumer.print().accept(bd);
		PrinterConsumer.print().accept(str);
	}

	private static void getPrinterBiConsumer(final BigDecimal bd, final String str) {
		PrinterBiConsumer.print().accept(100, 1);
		PrinterBiConsumer.print().accept(99.89, 2);
		PrinterBiConsumer.print().accept(bd, 3);
		PrinterBiConsumer.print().accept(str, 4);
	}

	private static void getPrinterFunctionaWithAnnotation(final BigDecimal bd, final String str) {
		PrinterFunctionaWithAnnotation.print().apply(100);
		PrinterFunctionaWithAnnotation.print().apply(99.89);
		PrinterFunctionaWithAnnotation.print().apply(bd);
		PrinterFunctionaWithAnnotation.print().apply(str);
	}

	private static void getPrinterConsumerWithAnnotation(final BigDecimal bd, final String str) {
		PrinterConsumerWithAnnotation.print().accept(100);
		PrinterConsumerWithAnnotation.print().accept(99.89);
		PrinterConsumerWithAnnotation.print().accept(bd);
		PrinterConsumerWithAnnotation.print().accept(str);
	}

}
