# NameThatColor Java Port

This is the Java Port of the NameThatColor JavaScript library by Chirag Menta. I'll use this code for an Android application to help people who suffer from color blindness.

# Usage

Import NTC.java to your class and then create a instance of it like this:

```java

	NTC ntc = new NTC();
        String matchStatus = "Approx. Color";
        ArrayList<String> results = ntc.findName("#1212AB");
        System.out.println("Color Hex: " + results.get(0));
        System.out.println("Color Name: " + results.get(1));
        if (results.get(2).equals("True")){
            matchStatus = "Exact match!";
        }
        System.out.println(matchStatus);

```

findName method returns and ArrayList<String> and first item shows the hex code of the color, second item shows the name of the color,
 third item is whether True or False (both strings) if the color you specify is exact match or approx. match.

# Known Issues

1. ~~Can't parse 4 char hex codes(shorthand hex) at the moment. Will be fixed when I get free time on my hands.~~


# Disclaimer

1. Developer: Chirag Mehta, 16 Aug. 2007 (Last update: 3 Sep. 2007)
2. This text, algorithm, and design is copyrighted to Chirag Mehta, 2001.
3. The Farbtastic: jQuery color picker plug-in is copyrighted to Steven Wittens, 2007.
4. The Resene RGB Values List is copyrighted to Resene Paints Ltd, 2001.
