// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs Empty = new JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs();

    /**
     * The medium to store the volume. The default value is an empty string, which uses the storage of the node.
     * 
     */
    @Import(name="medium")
    private @Nullable Output<String> medium;

    /**
     * @return The medium to store the volume. The default value is an empty string, which uses the storage of the node.
     * 
     */
    public Optional<Output<String>> medium() {
        return Optional.ofNullable(this.medium);
    }

    /**
     * The maximum size of the volume. By default, there&#39;s no maximum size defined.
     * 
     */
    @Import(name="sizeLimit", required=true)
    private Output<String> sizeLimit;

    /**
     * @return The maximum size of the volume. By default, there&#39;s no maximum size defined.
     * 
     */
    public Output<String> sizeLimit() {
        return this.sizeLimit;
    }

    private JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs() {}

    private JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs(JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs $) {
        this.medium = $.medium;
        this.sizeLimit = $.sizeLimit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs $;

        public Builder() {
            $ = new JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs();
        }

        public Builder(JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs defaults) {
            $ = new JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param medium The medium to store the volume. The default value is an empty string, which uses the storage of the node.
         * 
         * @return builder
         * 
         */
        public Builder medium(@Nullable Output<String> medium) {
            $.medium = medium;
            return this;
        }

        /**
         * @param medium The medium to store the volume. The default value is an empty string, which uses the storage of the node.
         * 
         * @return builder
         * 
         */
        public Builder medium(String medium) {
            return medium(Output.of(medium));
        }

        /**
         * @param sizeLimit The maximum size of the volume. By default, there&#39;s no maximum size defined.
         * 
         * @return builder
         * 
         */
        public Builder sizeLimit(Output<String> sizeLimit) {
            $.sizeLimit = sizeLimit;
            return this;
        }

        /**
         * @param sizeLimit The maximum size of the volume. By default, there&#39;s no maximum size defined.
         * 
         * @return builder
         * 
         */
        public Builder sizeLimit(String sizeLimit) {
            return sizeLimit(Output.of(sizeLimit));
        }

        public JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs build() {
            if ($.sizeLimit == null) {
                throw new MissingRequiredPropertyException("JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs", "sizeLimit");
            }
            return $;
        }
    }

}
