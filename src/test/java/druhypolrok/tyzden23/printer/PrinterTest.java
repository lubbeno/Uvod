package druhypolrok.tyzden23.printer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {
Printer p = new Printer(100, true);

    @Test
    void addToner() {
    }

    @Test
    @DisplayName(value = "nejaky test nazov")
    void printPages() {
        assertAll(
                () ->assertEquals(5,p.printPages(10),"je to ok0"),
                () -> assertEquals(1,p.printPages(2),"je to ok1")
        );
    }

    @Test
    @Disabled
    void getPagesPrinted() {

    }
}