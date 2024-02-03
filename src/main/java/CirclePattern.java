public class CirclePattern {

    int radius;
    int padding;

    public CirclePattern(int radius, int padding) {
        this.radius = radius;
        this.padding = padding;
        int max  = radius + padding;

        String[][] canvas = initCanvas(max);
        pattern(canvas, radius, max);
        printCanvas(canvas);
    }

    static String[][] pattern(String[][] canvas, int radius, int max) {

        int radiusSq = radius * radius;
        System.out.println(max);
        for (int x = 0; x <= radius; x++ ) {

            int y = (int) Math.floor(Math.sqrt(radiusSq - x * x));

            canvas[max - y][max + x] = "MMM";
            canvas[max - y][max - x] = "MMM";
            canvas[max + y][max + x] = "MMM";
            canvas[max + y][max - x] = "MMM";

            System.out.println("x= " + x + ", y= " + y);
        }

        return canvas;
    }

    static void printCanvas(String[][] canvas) {

        for (String[] line: canvas) {
            for (String e: line) {
                System.out.print(e);
            }
            System.out.println();
        }
    }

    static String[][] initCanvas(int size) {

        size = 2 * size + 1;
        String[][] canvas = new String[size][size];

        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                canvas[x][y] = "...";
            }
        }
        return canvas;
    }
}
