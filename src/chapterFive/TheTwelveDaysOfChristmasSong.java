package chapterFive;

public class TheTwelveDaysOfChristmasSong {
    public static void main(String[] args) {
        int christmasDays = 1;
        while (christmasDays <= 12) {
            System.out.print("On the " +christmasDays);
            switch (christmasDays) {
                case (1) -> System.out.print("st ");
                case (2) -> System.out.print("nd ");
                case (3) -> System.out.print("rd ");
                default -> System.out.print("th ");
            }
            System.out.println("day of Christmas my true love sent to me");
            switch (christmasDays) {
                case (12) ->
                        System.out.println("Twelve drummers drumming, Eleven pipers piping, Ten lords a-leaping, Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five gold rings, Four calling birds, Three French hens, Two turtle doves, And a partridge in a pear tree, ");
                case (11) ->
                        System.out.println("Eleven pipers piping, Ten lords a-leaping, Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five gold rings, Four calling birds, Three French hens, Two turtle doves, And a partridge in a pear tree, ");
                case (10) ->
                        System.out.println("Ten lords a-leaping, Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five gold rings, Four calling birds, Three French hens, Two turtle doves, And a partridge in a pear tree, ");
                case (9) ->
                        System.out.println("Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five gold rings, Four calling birds, Three French hens, Two turtle doves, And a partridge in a pear tree, ");
                case (8) ->
                        System.out.println("Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five gold rings, Four calling birds, Three French hens, Two turtle doves, And a partridge in a pear tree, ");
                case (7) ->
                        System.out.println("Seven swans a-swimming, Six geese a-laying, Five gold rings, Four calling birds, Three French hens, Two turtle doves, And a partridge in a pear tree, ");
                case (6) ->
                        System.out.println("Six geese a-laying, Five gold rings, Four calling birds, Three French hens, Two turtle doves, And a partridge in a pear tree, ");
                case (5) ->
                        System.out.println("Five gold rings, Four calling birds, Three French hens, Two turtle doves, And a partridge in a pear tree, ");
                case (4) ->
                        System.out.println("Four calling birds, Three French hens, Two turtle doves, And a partridge in a pear tree, ");
                case (3) -> System.out.println("Three French hens, Two turtle doves, And a partridge in a pear tree, ");
                case (2) -> System.out.println("Two turtle doves,And a partridge in a pear tree, ");
                case (1) -> System.out.println("A partridge in a pear tree, ");
            }
        christmasDays++;
        System.out.println();
        }
    }
}
