// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs Empty = new V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs();

    @Import(name="allowInterrupt")
    private @Nullable Output<Boolean> allowInterrupt;

    public Optional<Output<Boolean>> allowInterrupt() {
        return Optional.ofNullable(this.allowInterrupt);
    }

    @Import(name="frequencyInSeconds", required=true)
    private Output<Integer> frequencyInSeconds;

    public Output<Integer> frequencyInSeconds() {
        return this.frequencyInSeconds;
    }

    @Import(name="messageGroups")
    private @Nullable Output<List<V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs>> messageGroups;

    public Optional<Output<List<V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs>>> messageGroups() {
        return Optional.ofNullable(this.messageGroups);
    }

    @Import(name="timeoutInSeconds", required=true)
    private Output<Integer> timeoutInSeconds;

    public Output<Integer> timeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    private V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs() {}

    private V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs(V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs $) {
        this.allowInterrupt = $.allowInterrupt;
        this.frequencyInSeconds = $.frequencyInSeconds;
        this.messageGroups = $.messageGroups;
        this.timeoutInSeconds = $.timeoutInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs $;

        public Builder() {
            $ = new V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs();
        }

        public Builder(V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs defaults) {
            $ = new V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowInterrupt(@Nullable Output<Boolean> allowInterrupt) {
            $.allowInterrupt = allowInterrupt;
            return this;
        }

        public Builder allowInterrupt(Boolean allowInterrupt) {
            return allowInterrupt(Output.of(allowInterrupt));
        }

        public Builder frequencyInSeconds(Output<Integer> frequencyInSeconds) {
            $.frequencyInSeconds = frequencyInSeconds;
            return this;
        }

        public Builder frequencyInSeconds(Integer frequencyInSeconds) {
            return frequencyInSeconds(Output.of(frequencyInSeconds));
        }

        public Builder messageGroups(@Nullable Output<List<V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs>> messageGroups) {
            $.messageGroups = messageGroups;
            return this;
        }

        public Builder messageGroups(List<V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs> messageGroups) {
            return messageGroups(Output.of(messageGroups));
        }

        public Builder messageGroups(V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs... messageGroups) {
            return messageGroups(List.of(messageGroups));
        }

        public Builder timeoutInSeconds(Output<Integer> timeoutInSeconds) {
            $.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            return timeoutInSeconds(Output.of(timeoutInSeconds));
        }

        public V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs build() {
            if ($.frequencyInSeconds == null) {
                throw new MissingRequiredPropertyException("V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs", "frequencyInSeconds");
            }
            if ($.timeoutInSeconds == null) {
                throw new MissingRequiredPropertyException("V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs", "timeoutInSeconds");
            }
            return $;
        }
    }

}
