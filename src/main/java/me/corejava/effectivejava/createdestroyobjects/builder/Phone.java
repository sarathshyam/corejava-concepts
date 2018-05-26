package me.corejava.effectivejava.createdestroyobjects.builder;

/**
 * Example of a Builder pattern when there are many optional properties in a class
 *
 * @author Sarath
 */
public class Phone {

    private final String make;
    private final String model;
    private final String color;
    private final int diskSizeIngb;
    private final String yearOfMake;
    private final String osVersion;
    private final String imeiNum;
    private final String serialNum;

    public static class Builder {

        private final String make;
        private final String model;
        private String color;
        private int diskSizeIngb;
        private String yearOfMake;
        private String osVersion;
        private String imeiNum;
        private String serialNum;

        public Builder(String make, String model) {
            this.make = make;
            this.model = model;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder diskSizeIngb(int val) {
            this.diskSizeIngb = val;
            return this;
        }

        public Builder yearOfMake(String val) {
            this.yearOfMake = val;
            return this;
        }

        public Builder osVersion(String val) {
            this.osVersion = val;
            return this;
        }

        public Builder imeiNum(String val) {
            this.imeiNum = val;
            return this;
        }

        public Builder serialNum(String val) {
            this.serialNum = val;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }

    }

    private Phone(Builder builder) {
        make = builder.make;
        model = builder.model;
        color = builder.color;
        diskSizeIngb = builder.diskSizeIngb;
        yearOfMake = builder.yearOfMake;
        osVersion = builder.osVersion;
        imeiNum = builder.imeiNum;
        serialNum = builder.serialNum;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", diskSizeIngb=" + diskSizeIngb +
                ", yearOfMake='" + yearOfMake + '\'' +
                ", osVersion='" + osVersion + '\'' +
                ", imeiNum='" + imeiNum + '\'' +
                ", serialNum='" + serialNum + '\'' +
                '}';
    }
}
