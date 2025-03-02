// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.scheduler.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduleTargetEcsParametersNetworkConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleTargetEcsParametersNetworkConfigurationArgs Empty = new ScheduleTargetEcsParametersNetworkConfigurationArgs();

    /**
     * Specifies whether the task&#39;s elastic network interface receives a public IP address. This attribute is a boolean type, where `true` maps to `ENABLED` and `false` to `DISABLED`. You can specify `true` only when the `launch_type` is set to `FARGATE`.
     * 
     */
    @Import(name="assignPublicIp")
    private @Nullable Output<Boolean> assignPublicIp;

    /**
     * @return Specifies whether the task&#39;s elastic network interface receives a public IP address. This attribute is a boolean type, where `true` maps to `ENABLED` and `false` to `DISABLED`. You can specify `true` only when the `launch_type` is set to `FARGATE`.
     * 
     */
    public Optional<Output<Boolean>> assignPublicIp() {
        return Optional.ofNullable(this.assignPublicIp);
    }

    /**
     * Set of 1 to 5 Security Group ID-s to be associated with the task. These security groups must all be in the same VPC.
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return Set of 1 to 5 Security Group ID-s to be associated with the task. These security groups must all be in the same VPC.
     * 
     */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * Set of 1 to 16 subnets to be associated with the task. These subnets must all be in the same VPC.
     * 
     */
    @Import(name="subnets", required=true)
    private Output<List<String>> subnets;

    /**
     * @return Set of 1 to 16 subnets to be associated with the task. These subnets must all be in the same VPC.
     * 
     */
    public Output<List<String>> subnets() {
        return this.subnets;
    }

    private ScheduleTargetEcsParametersNetworkConfigurationArgs() {}

    private ScheduleTargetEcsParametersNetworkConfigurationArgs(ScheduleTargetEcsParametersNetworkConfigurationArgs $) {
        this.assignPublicIp = $.assignPublicIp;
        this.securityGroups = $.securityGroups;
        this.subnets = $.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleTargetEcsParametersNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleTargetEcsParametersNetworkConfigurationArgs $;

        public Builder() {
            $ = new ScheduleTargetEcsParametersNetworkConfigurationArgs();
        }

        public Builder(ScheduleTargetEcsParametersNetworkConfigurationArgs defaults) {
            $ = new ScheduleTargetEcsParametersNetworkConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignPublicIp Specifies whether the task&#39;s elastic network interface receives a public IP address. This attribute is a boolean type, where `true` maps to `ENABLED` and `false` to `DISABLED`. You can specify `true` only when the `launch_type` is set to `FARGATE`.
         * 
         * @return builder
         * 
         */
        public Builder assignPublicIp(@Nullable Output<Boolean> assignPublicIp) {
            $.assignPublicIp = assignPublicIp;
            return this;
        }

        /**
         * @param assignPublicIp Specifies whether the task&#39;s elastic network interface receives a public IP address. This attribute is a boolean type, where `true` maps to `ENABLED` and `false` to `DISABLED`. You can specify `true` only when the `launch_type` is set to `FARGATE`.
         * 
         * @return builder
         * 
         */
        public Builder assignPublicIp(Boolean assignPublicIp) {
            return assignPublicIp(Output.of(assignPublicIp));
        }

        /**
         * @param securityGroups Set of 1 to 5 Security Group ID-s to be associated with the task. These security groups must all be in the same VPC.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups Set of 1 to 5 Security Group ID-s to be associated with the task. These security groups must all be in the same VPC.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups Set of 1 to 5 Security Group ID-s to be associated with the task. These security groups must all be in the same VPC.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param subnets Set of 1 to 16 subnets to be associated with the task. These subnets must all be in the same VPC.
         * 
         * @return builder
         * 
         */
        public Builder subnets(Output<List<String>> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets Set of 1 to 16 subnets to be associated with the task. These subnets must all be in the same VPC.
         * 
         * @return builder
         * 
         */
        public Builder subnets(List<String> subnets) {
            return subnets(Output.of(subnets));
        }

        /**
         * @param subnets Set of 1 to 16 subnets to be associated with the task. These subnets must all be in the same VPC.
         * 
         * @return builder
         * 
         */
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }

        public ScheduleTargetEcsParametersNetworkConfigurationArgs build() {
            if ($.subnets == null) {
                throw new MissingRequiredPropertyException("ScheduleTargetEcsParametersNetworkConfigurationArgs", "subnets");
            }
            return $;
        }
    }

}
