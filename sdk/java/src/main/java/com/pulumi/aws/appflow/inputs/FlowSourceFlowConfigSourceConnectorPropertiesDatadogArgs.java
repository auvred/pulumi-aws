// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs Empty = new FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs();

    /**
     * Object specified in the flow destination.
     * 
     */
    @Import(name="object", required=true)
    private Output<String> object;

    /**
     * @return Object specified in the flow destination.
     * 
     */
    public Output<String> object() {
        return this.object;
    }

    private FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs() {}

    private FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs(FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs $) {
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs $;

        public Builder() {
            $ = new FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs();
        }

        public Builder(FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs defaults) {
            $ = new FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param object Object specified in the flow destination.
         * 
         * @return builder
         * 
         */
        public Builder object(Output<String> object) {
            $.object = object;
            return this;
        }

        /**
         * @param object Object specified in the flow destination.
         * 
         * @return builder
         * 
         */
        public Builder object(String object) {
            return object(Output.of(object));
        }

        public FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs build() {
            if ($.object == null) {
                throw new MissingRequiredPropertyException("FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs", "object");
            }
            return $;
        }
    }

}
