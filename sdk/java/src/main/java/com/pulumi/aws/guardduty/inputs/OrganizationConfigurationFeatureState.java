// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.inputs;

import com.pulumi.aws.guardduty.inputs.OrganizationConfigurationFeatureAdditionalConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationConfigurationFeatureState extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationConfigurationFeatureState Empty = new OrganizationConfigurationFeatureState();

    /**
     * The additional information that will be configured for the organization See below.
     * 
     */
    @Import(name="additionalConfigurations")
    private @Nullable Output<List<OrganizationConfigurationFeatureAdditionalConfigurationArgs>> additionalConfigurations;

    /**
     * @return The additional information that will be configured for the organization See below.
     * 
     */
    public Optional<Output<List<OrganizationConfigurationFeatureAdditionalConfigurationArgs>>> additionalConfigurations() {
        return Optional.ofNullable(this.additionalConfigurations);
    }

    /**
     * The status of the feature that is configured for the member accounts within the organization. Valid values: `NEW`, `ALL`, `NONE`.
     * 
     */
    @Import(name="autoEnable")
    private @Nullable Output<String> autoEnable;

    /**
     * @return The status of the feature that is configured for the member accounts within the organization. Valid values: `NEW`, `ALL`, `NONE`.
     * 
     */
    public Optional<Output<String>> autoEnable() {
        return Optional.ofNullable(this.autoEnable);
    }

    /**
     * The ID of the detector that configures the delegated administrator.
     * 
     */
    @Import(name="detectorId")
    private @Nullable Output<String> detectorId;

    /**
     * @return The ID of the detector that configures the delegated administrator.
     * 
     */
    public Optional<Output<String>> detectorId() {
        return Optional.ofNullable(this.detectorId);
    }

    /**
     * The name of the feature that will be configured for the organization. Valid values: `S3_DATA_EVENTS`, `EKS_AUDIT_LOGS`, `EBS_MALWARE_PROTECTION`, `RDS_LOGIN_EVENTS`, `EKS_RUNTIME_MONITORING`, `LAMBDA_NETWORK_LOGS`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the feature that will be configured for the organization. Valid values: `S3_DATA_EVENTS`, `EKS_AUDIT_LOGS`, `EBS_MALWARE_PROTECTION`, `RDS_LOGIN_EVENTS`, `EKS_RUNTIME_MONITORING`, `LAMBDA_NETWORK_LOGS`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private OrganizationConfigurationFeatureState() {}

    private OrganizationConfigurationFeatureState(OrganizationConfigurationFeatureState $) {
        this.additionalConfigurations = $.additionalConfigurations;
        this.autoEnable = $.autoEnable;
        this.detectorId = $.detectorId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationConfigurationFeatureState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationConfigurationFeatureState $;

        public Builder() {
            $ = new OrganizationConfigurationFeatureState();
        }

        public Builder(OrganizationConfigurationFeatureState defaults) {
            $ = new OrganizationConfigurationFeatureState(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalConfigurations The additional information that will be configured for the organization See below.
         * 
         * @return builder
         * 
         */
        public Builder additionalConfigurations(@Nullable Output<List<OrganizationConfigurationFeatureAdditionalConfigurationArgs>> additionalConfigurations) {
            $.additionalConfigurations = additionalConfigurations;
            return this;
        }

        /**
         * @param additionalConfigurations The additional information that will be configured for the organization See below.
         * 
         * @return builder
         * 
         */
        public Builder additionalConfigurations(List<OrganizationConfigurationFeatureAdditionalConfigurationArgs> additionalConfigurations) {
            return additionalConfigurations(Output.of(additionalConfigurations));
        }

        /**
         * @param additionalConfigurations The additional information that will be configured for the organization See below.
         * 
         * @return builder
         * 
         */
        public Builder additionalConfigurations(OrganizationConfigurationFeatureAdditionalConfigurationArgs... additionalConfigurations) {
            return additionalConfigurations(List.of(additionalConfigurations));
        }

        /**
         * @param autoEnable The status of the feature that is configured for the member accounts within the organization. Valid values: `NEW`, `ALL`, `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder autoEnable(@Nullable Output<String> autoEnable) {
            $.autoEnable = autoEnable;
            return this;
        }

        /**
         * @param autoEnable The status of the feature that is configured for the member accounts within the organization. Valid values: `NEW`, `ALL`, `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder autoEnable(String autoEnable) {
            return autoEnable(Output.of(autoEnable));
        }

        /**
         * @param detectorId The ID of the detector that configures the delegated administrator.
         * 
         * @return builder
         * 
         */
        public Builder detectorId(@Nullable Output<String> detectorId) {
            $.detectorId = detectorId;
            return this;
        }

        /**
         * @param detectorId The ID of the detector that configures the delegated administrator.
         * 
         * @return builder
         * 
         */
        public Builder detectorId(String detectorId) {
            return detectorId(Output.of(detectorId));
        }

        /**
         * @param name The name of the feature that will be configured for the organization. Valid values: `S3_DATA_EVENTS`, `EKS_AUDIT_LOGS`, `EBS_MALWARE_PROTECTION`, `RDS_LOGIN_EVENTS`, `EKS_RUNTIME_MONITORING`, `LAMBDA_NETWORK_LOGS`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the feature that will be configured for the organization. Valid values: `S3_DATA_EVENTS`, `EKS_AUDIT_LOGS`, `EBS_MALWARE_PROTECTION`, `RDS_LOGIN_EVENTS`, `EKS_RUNTIME_MONITORING`, `LAMBDA_NETWORK_LOGS`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public OrganizationConfigurationFeatureState build() {
            return $;
        }
    }

}
