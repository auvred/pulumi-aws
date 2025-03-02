// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sesv2.inputs;

import com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;


public final class ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs Empty = new ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs();

    /**
     * An array of objects that define the dimensions to use when you send email events to Amazon CloudWatch. See dimension_configuration below.
     * 
     */
    @Import(name="dimensionConfigurations", required=true)
    private Output<List<ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfigurationArgs>> dimensionConfigurations;

    /**
     * @return An array of objects that define the dimensions to use when you send email events to Amazon CloudWatch. See dimension_configuration below.
     * 
     */
    public Output<List<ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfigurationArgs>> dimensionConfigurations() {
        return this.dimensionConfigurations;
    }

    private ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs() {}

    private ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs(ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs $) {
        this.dimensionConfigurations = $.dimensionConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs $;

        public Builder() {
            $ = new ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs();
        }

        public Builder(ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs defaults) {
            $ = new ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dimensionConfigurations An array of objects that define the dimensions to use when you send email events to Amazon CloudWatch. See dimension_configuration below.
         * 
         * @return builder
         * 
         */
        public Builder dimensionConfigurations(Output<List<ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfigurationArgs>> dimensionConfigurations) {
            $.dimensionConfigurations = dimensionConfigurations;
            return this;
        }

        /**
         * @param dimensionConfigurations An array of objects that define the dimensions to use when you send email events to Amazon CloudWatch. See dimension_configuration below.
         * 
         * @return builder
         * 
         */
        public Builder dimensionConfigurations(List<ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfigurationArgs> dimensionConfigurations) {
            return dimensionConfigurations(Output.of(dimensionConfigurations));
        }

        /**
         * @param dimensionConfigurations An array of objects that define the dimensions to use when you send email events to Amazon CloudWatch. See dimension_configuration below.
         * 
         * @return builder
         * 
         */
        public Builder dimensionConfigurations(ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfigurationArgs... dimensionConfigurations) {
            return dimensionConfigurations(List.of(dimensionConfigurations));
        }

        public ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs build() {
            if ($.dimensionConfigurations == null) {
                throw new MissingRequiredPropertyException("ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs", "dimensionConfigurations");
            }
            return $;
        }
    }

}
