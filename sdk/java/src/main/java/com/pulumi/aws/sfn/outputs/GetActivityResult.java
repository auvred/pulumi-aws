// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sfn.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetActivityResult {
    private String arn;
    /**
     * @return Date the activity was created.
     * 
     */
    private String creationDate;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;

    private GetActivityResult() {}
    public String arn() {
        return this.arn;
    }
    /**
     * @return Date the activity was created.
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActivityResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String creationDate;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetActivityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.creationDate = defaults.creationDate;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            if (arn == null) {
              throw new MissingRequiredPropertyException("GetActivityResult", "arn");
            }
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder creationDate(String creationDate) {
            if (creationDate == null) {
              throw new MissingRequiredPropertyException("GetActivityResult", "creationDate");
            }
            this.creationDate = creationDate;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetActivityResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetActivityResult", "name");
            }
            this.name = name;
            return this;
        }
        public GetActivityResult build() {
            final var _resultValue = new GetActivityResult();
            _resultValue.arn = arn;
            _resultValue.creationDate = creationDate;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
