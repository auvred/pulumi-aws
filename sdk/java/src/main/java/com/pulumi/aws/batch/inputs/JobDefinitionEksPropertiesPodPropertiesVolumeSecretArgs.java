// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs Empty = new JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs();

    /**
     * Specifies whether the secret or the secret&#39;s keys must be defined.
     * 
     */
    @Import(name="optional")
    private @Nullable Output<Boolean> optional;

    /**
     * @return Specifies whether the secret or the secret&#39;s keys must be defined.
     * 
     */
    public Optional<Output<Boolean>> optional() {
        return Optional.ofNullable(this.optional);
    }

    /**
     * The name of the secret. The name must be allowed as a DNS subdomain name.
     * 
     */
    @Import(name="secretName", required=true)
    private Output<String> secretName;

    /**
     * @return The name of the secret. The name must be allowed as a DNS subdomain name.
     * 
     */
    public Output<String> secretName() {
        return this.secretName;
    }

    private JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs() {}

    private JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs(JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs $) {
        this.optional = $.optional;
        this.secretName = $.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs $;

        public Builder() {
            $ = new JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs();
        }

        public Builder(JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs defaults) {
            $ = new JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param optional Specifies whether the secret or the secret&#39;s keys must be defined.
         * 
         * @return builder
         * 
         */
        public Builder optional(@Nullable Output<Boolean> optional) {
            $.optional = optional;
            return this;
        }

        /**
         * @param optional Specifies whether the secret or the secret&#39;s keys must be defined.
         * 
         * @return builder
         * 
         */
        public Builder optional(Boolean optional) {
            return optional(Output.of(optional));
        }

        /**
         * @param secretName The name of the secret. The name must be allowed as a DNS subdomain name.
         * 
         * @return builder
         * 
         */
        public Builder secretName(Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName The name of the secret. The name must be allowed as a DNS subdomain name.
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        public JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs build() {
            if ($.secretName == null) {
                throw new MissingRequiredPropertyException("JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs", "secretName");
            }
            return $;
        }
    }

}
