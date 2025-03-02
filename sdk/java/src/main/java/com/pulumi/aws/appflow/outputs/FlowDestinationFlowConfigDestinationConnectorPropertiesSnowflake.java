// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeErrorHandlingConfig;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake {
    /**
     * @return Amazon S3 bucket prefix.
     * 
     */
    private @Nullable String bucketPrefix;
    /**
     * @return Settings that determine how Amazon AppFlow handles an error when placing data in the custom connector as destination. See Error Handling Config for more details.
     * 
     */
    private @Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeErrorHandlingConfig errorHandlingConfig;
    /**
     * @return Intermediate bucket that Amazon AppFlow uses when moving data into Amazon Redshift.
     * 
     */
    private String intermediateBucketName;
    /**
     * @return Object specified in the flow destination.
     * 
     */
    private String object;

    private FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake() {}
    /**
     * @return Amazon S3 bucket prefix.
     * 
     */
    public Optional<String> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }
    /**
     * @return Settings that determine how Amazon AppFlow handles an error when placing data in the custom connector as destination. See Error Handling Config for more details.
     * 
     */
    public Optional<FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeErrorHandlingConfig> errorHandlingConfig() {
        return Optional.ofNullable(this.errorHandlingConfig);
    }
    /**
     * @return Intermediate bucket that Amazon AppFlow uses when moving data into Amazon Redshift.
     * 
     */
    public String intermediateBucketName() {
        return this.intermediateBucketName;
    }
    /**
     * @return Object specified in the flow destination.
     * 
     */
    public String object() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bucketPrefix;
        private @Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeErrorHandlingConfig errorHandlingConfig;
        private String intermediateBucketName;
        private String object;
        public Builder() {}
        public Builder(FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.errorHandlingConfig = defaults.errorHandlingConfig;
    	      this.intermediateBucketName = defaults.intermediateBucketName;
    	      this.object = defaults.object;
        }

        @CustomType.Setter
        public Builder bucketPrefix(@Nullable String bucketPrefix) {

            this.bucketPrefix = bucketPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder errorHandlingConfig(@Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeErrorHandlingConfig errorHandlingConfig) {

            this.errorHandlingConfig = errorHandlingConfig;
            return this;
        }
        @CustomType.Setter
        public Builder intermediateBucketName(String intermediateBucketName) {
            if (intermediateBucketName == null) {
              throw new MissingRequiredPropertyException("FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake", "intermediateBucketName");
            }
            this.intermediateBucketName = intermediateBucketName;
            return this;
        }
        @CustomType.Setter
        public Builder object(String object) {
            if (object == null) {
              throw new MissingRequiredPropertyException("FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake", "object");
            }
            this.object = object;
            return this;
        }
        public FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake build() {
            final var _resultValue = new FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake();
            _resultValue.bucketPrefix = bucketPrefix;
            _resultValue.errorHandlingConfig = errorHandlingConfig;
            _resultValue.intermediateBucketName = intermediateBucketName;
            _resultValue.object = object;
            return _resultValue;
        }
    }
}
