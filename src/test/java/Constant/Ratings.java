package Constant;

import org.codehaus.jackson.annotate.JsonProperty;

public class Ratings {
    @JsonProperty("Source")
    public String source;
    @JsonProperty("Value")
    public String value;
}
