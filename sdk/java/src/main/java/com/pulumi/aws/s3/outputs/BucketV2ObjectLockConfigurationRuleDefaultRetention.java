// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketV2ObjectLockConfigurationRuleDefaultRetention {
    /**
     * @return Number of days that you want to specify for the default retention period.
     * 
     */
    private @Nullable Integer days;
    /**
     * @return Default Object Lock retention mode you want to apply to new objects placed in this bucket. Valid values are `GOVERNANCE` and `COMPLIANCE`.
     * 
     */
    private String mode;
    /**
     * @return Number of years that you want to specify for the default retention period.
     * 
     */
    private @Nullable Integer years;

    private BucketV2ObjectLockConfigurationRuleDefaultRetention() {}
    /**
     * @return Number of days that you want to specify for the default retention period.
     * 
     */
    public Optional<Integer> days() {
        return Optional.ofNullable(this.days);
    }
    /**
     * @return Default Object Lock retention mode you want to apply to new objects placed in this bucket. Valid values are `GOVERNANCE` and `COMPLIANCE`.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return Number of years that you want to specify for the default retention period.
     * 
     */
    public Optional<Integer> years() {
        return Optional.ofNullable(this.years);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketV2ObjectLockConfigurationRuleDefaultRetention defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer days;
        private String mode;
        private @Nullable Integer years;
        public Builder() {}
        public Builder(BucketV2ObjectLockConfigurationRuleDefaultRetention defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.mode = defaults.mode;
    	      this.years = defaults.years;
        }

        @CustomType.Setter
        public Builder days(@Nullable Integer days) {

            this.days = days;
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("BucketV2ObjectLockConfigurationRuleDefaultRetention", "mode");
            }
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder years(@Nullable Integer years) {

            this.years = years;
            return this;
        }
        public BucketV2ObjectLockConfigurationRuleDefaultRetention build() {
            final var _resultValue = new BucketV2ObjectLockConfigurationRuleDefaultRetention();
            _resultValue.days = days;
            _resultValue.mode = mode;
            _resultValue.years = years;
            return _resultValue;
        }
    }
}
