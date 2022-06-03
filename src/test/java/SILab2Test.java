import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyStatementTestC0(){

        List<String> rLL = new ArrayList<>();
        rLL.add("0");
        rLL.add("#");
        rLL.add("0");
        rLL.add("0");
        rLL.add("0");
        rLL.add("#");
        rLL.add("#");
        rLL.add("0");
        rLL.add("#");

        List<String> add_List = new ArrayList<>();
        add_List.add("1");
        add_List.add("#");
        add_List.add("2");
        add_List.add("1");
        add_List.add("2");
        add_List.add("#");
        add_List.add("#");
        add_List.add("2");
        add_List.add("#");

        assertEquals(add_List, SILab2.function(rLL));

        List<String> exitl = new ArrayList<>();
        add_List.add("0");
        add_List.add("#");
        add_List.add("0");


        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exitl));

        List<String> exitl2 = new ArrayList<>();

        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exitl2));
    }
}