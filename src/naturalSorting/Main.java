package naturalSorting;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Color> colors = new ArrayList<>();

        Color color1 = new Color();
        color1.setName("Red");
        colors.add(color1);

        Color color2 = new Color();
        color2.setName("Blue");
        colors.add(color2);

        Color color3 = new Color();
        color3.setName("Yellow");
        colors.add(color3);

        Color color4 = new Color();
        color4.setName("Green");
        colors.add(color4);

        for (Color color:colors) {
            System.out.println(color);
        }
        System.out.println("----------------------");
        colors.sort(null);

        for (Color color:colors) {
            System.out.println(color);
        }
    }
}
