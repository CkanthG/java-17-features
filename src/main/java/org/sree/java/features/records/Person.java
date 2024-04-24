package org.sree.java.features.records;

public record Person(String name, int age) {
    // No need to write explicit constructor, accessors, equals, hashCode, or toString
}
