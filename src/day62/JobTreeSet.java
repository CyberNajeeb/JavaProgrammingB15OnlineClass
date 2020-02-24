package day62;

import day61.Job;

import java.util.*;

public class JobTreeSet {
    public static void main(String[] args) {

        SortedSet<Job> integers = new TreeSet<>();

        integers.add(new Job("GA", 120000, "BOFA"));
        integers.add(new Job("VA", 110000, "Amazon"));
        integers.add(new Job("NY", 140000, "FaceBook"));
        integers.add(new Job("CA", 150000, "Apple"));
        integers.add(new Job("WA", 145000, "Microsoft"));

        for (Job each : integers) {
            System.out.println("each = " + each);
        }
        
    }
}
