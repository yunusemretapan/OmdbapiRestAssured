package Constant;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class Search {
        @JsonProperty("Title")
        public String title;
        @JsonProperty("Year")
        public String year;
        @JsonProperty("Rated")
        private String rated;
        @JsonProperty("Released")
        public String released;
        @JsonProperty("Runtime")
        private String runtime;
        @JsonProperty("Genre")
        private String genre;
        @JsonProperty("Director")
        private String director;
        @JsonProperty("Writer")
        private String writer;
        @JsonProperty("Actors")
        private String actors;
        @JsonProperty("Plot")
        private String plot;
        @JsonProperty("Language")
        private String language;
        @JsonProperty("Country")
        private String country;
        @JsonProperty("Awards")
        private String awards;
        @JsonProperty("Poster")
        private String poster;
        @JsonProperty("Ratings")
        private List<Ratings> ratings;
        @JsonProperty("Metascore")
        private String metascore;
        @JsonProperty("imdbRating")
        private String imdbRating;
        @JsonProperty("imdbVotes")
        private String imdbVotes;
        @JsonProperty("imdbID")
        private String imdbID;
        @JsonProperty("Type")
        private String type;
        @JsonProperty("DVD")
        private String dvd;
        @JsonProperty("BoxOffice")
        private String boxOffice;
        @JsonProperty("Production")
        private String production;
        @JsonProperty("Website")
        private String website;
        @JsonProperty("Response")
        public String response;
        @JsonProperty("Error")
        public String Error;
    }
