package com.rrmsense.autovalueexample;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/**
 * Created by Talha on 5/2/2017.
 */
@AutoValue
public abstract class Person {
    public static Person create(String name, String email, String password) {
        return builder()
                .name(name)
                .email(email)
                .password(password)
                .build();
    }

    static Builder builder() {
        return new AutoValue_Person.Builder();
    }

    public static TypeAdapter<Person> typeAdapter(Gson gson) {
        return new AutoValue_Person.GsonTypeAdapter(gson);
    }

    abstract String name();

    abstract String email();

    abstract String password();

    abstract Person withEmail(String email);

    @AutoValue.Builder
    abstract static class Builder {
        public abstract Builder name(String name);

        public abstract Builder email(String email);

        public abstract Builder password(String password);

        public abstract Person build();
    }
}
