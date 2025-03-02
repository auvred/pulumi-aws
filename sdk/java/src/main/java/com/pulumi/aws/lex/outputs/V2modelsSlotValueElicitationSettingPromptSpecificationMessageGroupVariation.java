// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.aws.lex.outputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCard;
import com.pulumi.aws.lex.outputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationPlainTextMessage;
import com.pulumi.aws.lex.outputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationSsmlMessage;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariation {
    private List<Object> customPayloads;
    private @Nullable V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCard imageResponseCard;
    private @Nullable V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationPlainTextMessage plainTextMessage;
    private @Nullable V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationSsmlMessage ssmlMessage;

    private V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariation() {}
    public List<Object> customPayloads() {
        return this.customPayloads;
    }
    public Optional<V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCard> imageResponseCard() {
        return Optional.ofNullable(this.imageResponseCard);
    }
    public Optional<V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationPlainTextMessage> plainTextMessage() {
        return Optional.ofNullable(this.plainTextMessage);
    }
    public Optional<V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationSsmlMessage> ssmlMessage() {
        return Optional.ofNullable(this.ssmlMessage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Object> customPayloads;
        private @Nullable V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCard imageResponseCard;
        private @Nullable V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationPlainTextMessage plainTextMessage;
        private @Nullable V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationSsmlMessage ssmlMessage;
        public Builder() {}
        public Builder(V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customPayloads = defaults.customPayloads;
    	      this.imageResponseCard = defaults.imageResponseCard;
    	      this.plainTextMessage = defaults.plainTextMessage;
    	      this.ssmlMessage = defaults.ssmlMessage;
        }

        @CustomType.Setter
        public Builder customPayloads(List<Object> customPayloads) {
            if (customPayloads == null) {
              throw new MissingRequiredPropertyException("V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariation", "customPayloads");
            }
            this.customPayloads = customPayloads;
            return this;
        }
        public Builder customPayloads(Object... customPayloads) {
            return customPayloads(List.of(customPayloads));
        }
        @CustomType.Setter
        public Builder imageResponseCard(@Nullable V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCard imageResponseCard) {

            this.imageResponseCard = imageResponseCard;
            return this;
        }
        @CustomType.Setter
        public Builder plainTextMessage(@Nullable V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationPlainTextMessage plainTextMessage) {

            this.plainTextMessage = plainTextMessage;
            return this;
        }
        @CustomType.Setter
        public Builder ssmlMessage(@Nullable V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationSsmlMessage ssmlMessage) {

            this.ssmlMessage = ssmlMessage;
            return this;
        }
        public V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariation build() {
            final var _resultValue = new V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariation();
            _resultValue.customPayloads = customPayloads;
            _resultValue.imageResponseCard = imageResponseCard;
            _resultValue.plainTextMessage = plainTextMessage;
            _resultValue.ssmlMessage = ssmlMessage;
            return _resultValue;
        }
    }
}
