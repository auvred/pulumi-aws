// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.outposts.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOutpostInstanceTypePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOutpostInstanceTypePlainArgs Empty = new GetOutpostInstanceTypePlainArgs();

    /**
     * Outpost ARN.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return Outpost ARN.
     * 
     * The following arguments are optional:
     * 
     */
    public String arn() {
        return this.arn;
    }

    /**
     * Desired instance type. Conflicts with `preferred_instance_types`.
     * 
     */
    @Import(name="instanceType")
    private @Nullable String instanceType;

    /**
     * @return Desired instance type. Conflicts with `preferred_instance_types`.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * Ordered list of preferred instance types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. Conflicts with `instance_type`.
     * 
     */
    @Import(name="preferredInstanceTypes")
    private @Nullable List<String> preferredInstanceTypes;

    /**
     * @return Ordered list of preferred instance types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. Conflicts with `instance_type`.
     * 
     */
    public Optional<List<String>> preferredInstanceTypes() {
        return Optional.ofNullable(this.preferredInstanceTypes);
    }

    private GetOutpostInstanceTypePlainArgs() {}

    private GetOutpostInstanceTypePlainArgs(GetOutpostInstanceTypePlainArgs $) {
        this.arn = $.arn;
        this.instanceType = $.instanceType;
        this.preferredInstanceTypes = $.preferredInstanceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOutpostInstanceTypePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOutpostInstanceTypePlainArgs $;

        public Builder() {
            $ = new GetOutpostInstanceTypePlainArgs();
        }

        public Builder(GetOutpostInstanceTypePlainArgs defaults) {
            $ = new GetOutpostInstanceTypePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Outpost ARN.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param instanceType Desired instance type. Conflicts with `preferred_instance_types`.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable String instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param preferredInstanceTypes Ordered list of preferred instance types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. Conflicts with `instance_type`.
         * 
         * @return builder
         * 
         */
        public Builder preferredInstanceTypes(@Nullable List<String> preferredInstanceTypes) {
            $.preferredInstanceTypes = preferredInstanceTypes;
            return this;
        }

        /**
         * @param preferredInstanceTypes Ordered list of preferred instance types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. Conflicts with `instance_type`.
         * 
         * @return builder
         * 
         */
        public Builder preferredInstanceTypes(String... preferredInstanceTypes) {
            return preferredInstanceTypes(List.of(preferredInstanceTypes));
        }

        public GetOutpostInstanceTypePlainArgs build() {
            if ($.arn == null) {
                throw new MissingRequiredPropertyException("GetOutpostInstanceTypePlainArgs", "arn");
            }
            return $;
        }
    }

}
