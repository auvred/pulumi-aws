// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex;

import com.pulumi.aws.lex.inputs.V2modelsBotLocaleTimeoutsArgs;
import com.pulumi.aws.lex.inputs.V2modelsBotLocaleVoiceSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2modelsBotLocaleArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2modelsBotLocaleArgs Empty = new V2modelsBotLocaleArgs();

    /**
     * Identifier of the bot to create the locale for.
     * 
     */
    @Import(name="botId", required=true)
    private Output<String> botId;

    /**
     * @return Identifier of the bot to create the locale for.
     * 
     */
    public Output<String> botId() {
        return this.botId;
    }

    /**
     * Version of the bot to create the locale for. This can only be the draft version of the bot.
     * 
     */
    @Import(name="botVersion", required=true)
    private Output<String> botVersion;

    /**
     * @return Version of the bot to create the locale for. This can only be the draft version of the bot.
     * 
     */
    public Output<String> botVersion() {
        return this.botVersion;
    }

    /**
     * Description of the bot locale. Use this to help identify the bot locale in lists.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the bot locale. Use this to help identify the bot locale in lists.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Identifier of the language and locale that the bot will be used in. The string must match one of the supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more information, see Supported languages (https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html)
     * 
     */
    @Import(name="localeId", required=true)
    private Output<String> localeId;

    /**
     * @return Identifier of the language and locale that the bot will be used in. The string must match one of the supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more information, see Supported languages (https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html)
     * 
     */
    public Output<String> localeId() {
        return this.localeId;
    }

    /**
     * Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="nLuIntentConfidenceThreshold", required=true)
    private Output<Double> nLuIntentConfidenceThreshold;

    /**
     * @return Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<Double> nLuIntentConfidenceThreshold() {
        return this.nLuIntentConfidenceThreshold;
    }

    /**
     * Specified locale name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specified locale name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="timeouts")
    private @Nullable Output<V2modelsBotLocaleTimeoutsArgs> timeouts;

    public Optional<Output<V2modelsBotLocaleTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    /**
     * Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user. See `voice_settings`.
     * 
     */
    @Import(name="voiceSettings")
    private @Nullable Output<V2modelsBotLocaleVoiceSettingsArgs> voiceSettings;

    /**
     * @return Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user. See `voice_settings`.
     * 
     */
    public Optional<Output<V2modelsBotLocaleVoiceSettingsArgs>> voiceSettings() {
        return Optional.ofNullable(this.voiceSettings);
    }

    private V2modelsBotLocaleArgs() {}

    private V2modelsBotLocaleArgs(V2modelsBotLocaleArgs $) {
        this.botId = $.botId;
        this.botVersion = $.botVersion;
        this.description = $.description;
        this.localeId = $.localeId;
        this.nLuIntentConfidenceThreshold = $.nLuIntentConfidenceThreshold;
        this.name = $.name;
        this.timeouts = $.timeouts;
        this.voiceSettings = $.voiceSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2modelsBotLocaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2modelsBotLocaleArgs $;

        public Builder() {
            $ = new V2modelsBotLocaleArgs();
        }

        public Builder(V2modelsBotLocaleArgs defaults) {
            $ = new V2modelsBotLocaleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param botId Identifier of the bot to create the locale for.
         * 
         * @return builder
         * 
         */
        public Builder botId(Output<String> botId) {
            $.botId = botId;
            return this;
        }

        /**
         * @param botId Identifier of the bot to create the locale for.
         * 
         * @return builder
         * 
         */
        public Builder botId(String botId) {
            return botId(Output.of(botId));
        }

        /**
         * @param botVersion Version of the bot to create the locale for. This can only be the draft version of the bot.
         * 
         * @return builder
         * 
         */
        public Builder botVersion(Output<String> botVersion) {
            $.botVersion = botVersion;
            return this;
        }

        /**
         * @param botVersion Version of the bot to create the locale for. This can only be the draft version of the bot.
         * 
         * @return builder
         * 
         */
        public Builder botVersion(String botVersion) {
            return botVersion(Output.of(botVersion));
        }

        /**
         * @param description Description of the bot locale. Use this to help identify the bot locale in lists.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the bot locale. Use this to help identify the bot locale in lists.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param localeId Identifier of the language and locale that the bot will be used in. The string must match one of the supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more information, see Supported languages (https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html)
         * 
         * @return builder
         * 
         */
        public Builder localeId(Output<String> localeId) {
            $.localeId = localeId;
            return this;
        }

        /**
         * @param localeId Identifier of the language and locale that the bot will be used in. The string must match one of the supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more information, see Supported languages (https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html)
         * 
         * @return builder
         * 
         */
        public Builder localeId(String localeId) {
            return localeId(Output.of(localeId));
        }

        /**
         * @param nLuIntentConfidenceThreshold Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder nLuIntentConfidenceThreshold(Output<Double> nLuIntentConfidenceThreshold) {
            $.nLuIntentConfidenceThreshold = nLuIntentConfidenceThreshold;
            return this;
        }

        /**
         * @param nLuIntentConfidenceThreshold Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder nLuIntentConfidenceThreshold(Double nLuIntentConfidenceThreshold) {
            return nLuIntentConfidenceThreshold(Output.of(nLuIntentConfidenceThreshold));
        }

        /**
         * @param name Specified locale name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specified locale name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder timeouts(@Nullable Output<V2modelsBotLocaleTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(V2modelsBotLocaleTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        /**
         * @param voiceSettings Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user. See `voice_settings`.
         * 
         * @return builder
         * 
         */
        public Builder voiceSettings(@Nullable Output<V2modelsBotLocaleVoiceSettingsArgs> voiceSettings) {
            $.voiceSettings = voiceSettings;
            return this;
        }

        /**
         * @param voiceSettings Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user. See `voice_settings`.
         * 
         * @return builder
         * 
         */
        public Builder voiceSettings(V2modelsBotLocaleVoiceSettingsArgs voiceSettings) {
            return voiceSettings(Output.of(voiceSettings));
        }

        public V2modelsBotLocaleArgs build() {
            if ($.botId == null) {
                throw new MissingRequiredPropertyException("V2modelsBotLocaleArgs", "botId");
            }
            if ($.botVersion == null) {
                throw new MissingRequiredPropertyException("V2modelsBotLocaleArgs", "botVersion");
            }
            if ($.localeId == null) {
                throw new MissingRequiredPropertyException("V2modelsBotLocaleArgs", "localeId");
            }
            if ($.nLuIntentConfidenceThreshold == null) {
                throw new MissingRequiredPropertyException("V2modelsBotLocaleArgs", "nLuIntentConfidenceThreshold");
            }
            return $;
        }
    }

}
