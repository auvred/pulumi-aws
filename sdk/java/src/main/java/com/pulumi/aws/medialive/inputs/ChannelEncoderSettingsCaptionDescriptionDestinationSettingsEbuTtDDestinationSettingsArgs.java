// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettingsArgs Empty = new ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettingsArgs();

    /**
     * Complete this field if you want to include the name of the copyright holder in the copyright tag in the captions metadata.
     * 
     */
    @Import(name="copyrightHolder")
    private @Nullable Output<String> copyrightHolder;

    /**
     * @return Complete this field if you want to include the name of the copyright holder in the copyright tag in the captions metadata.
     * 
     */
    public Optional<Output<String>> copyrightHolder() {
        return Optional.ofNullable(this.copyrightHolder);
    }

    /**
     * Specifies how to handle the gap between the lines (in multi-line captions). - enabled: Fill with the captions background color (as specified in the input captions). - disabled: Leave the gap unfilled.
     * 
     */
    @Import(name="fillLineGap")
    private @Nullable Output<String> fillLineGap;

    /**
     * @return Specifies how to handle the gap between the lines (in multi-line captions). - enabled: Fill with the captions background color (as specified in the input captions). - disabled: Leave the gap unfilled.
     * 
     */
    public Optional<Output<String>> fillLineGap() {
        return Optional.ofNullable(this.fillLineGap);
    }

    /**
     * Specifies the font family to include in the font data attached to the EBU-TT captions. Valid only if styleControl is set to include. If you leave this field empty, the font family is set to “monospaced”. (If styleControl is set to exclude, the font family is always set to “monospaced”.) You specify only the font family. All other style information (color, bold, position and so on) is copied from the input captions. The size is always set to 100%!t(MISSING)o allow the downstream player to choose the size. - Enter a list of font families, as a comma-separated list of font names, in order of preference. The name can be a font family (such as “Arial”), or a generic font family (such as “serif”), or “default” (to let the downstream player choose the font). - Leave blank to set the family to “monospace”.
     * 
     */
    @Import(name="fontFamily")
    private @Nullable Output<String> fontFamily;

    /**
     * @return Specifies the font family to include in the font data attached to the EBU-TT captions. Valid only if styleControl is set to include. If you leave this field empty, the font family is set to “monospaced”. (If styleControl is set to exclude, the font family is always set to “monospaced”.) You specify only the font family. All other style information (color, bold, position and so on) is copied from the input captions. The size is always set to 100%!t(MISSING)o allow the downstream player to choose the size. - Enter a list of font families, as a comma-separated list of font names, in order of preference. The name can be a font family (such as “Arial”), or a generic font family (such as “serif”), or “default” (to let the downstream player choose the font). - Leave blank to set the family to “monospace”.
     * 
     */
    public Optional<Output<String>> fontFamily() {
        return Optional.ofNullable(this.fontFamily);
    }

    /**
     * Specifies the style information (font color, font position, and so on) to include in the font data that is attached to the EBU-TT captions. - include: Take the style information (font color, font position, and so on) from the source captions and include that information in the font data attached to the EBU-TT captions. This option is valid only if the source captions are Embedded or Teletext. - exclude: In the font data attached to the EBU-TT captions, set the font family to “monospaced”. Do not include any other style information.
     * 
     */
    @Import(name="styleControl")
    private @Nullable Output<String> styleControl;

    /**
     * @return Specifies the style information (font color, font position, and so on) to include in the font data that is attached to the EBU-TT captions. - include: Take the style information (font color, font position, and so on) from the source captions and include that information in the font data attached to the EBU-TT captions. This option is valid only if the source captions are Embedded or Teletext. - exclude: In the font data attached to the EBU-TT captions, set the font family to “monospaced”. Do not include any other style information.
     * 
     */
    public Optional<Output<String>> styleControl() {
        return Optional.ofNullable(this.styleControl);
    }

    private ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettingsArgs() {}

    private ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettingsArgs(ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettingsArgs $) {
        this.copyrightHolder = $.copyrightHolder;
        this.fillLineGap = $.fillLineGap;
        this.fontFamily = $.fontFamily;
        this.styleControl = $.styleControl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettingsArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettingsArgs();
        }

        public Builder(ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettingsArgs defaults) {
            $ = new ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param copyrightHolder Complete this field if you want to include the name of the copyright holder in the copyright tag in the captions metadata.
         * 
         * @return builder
         * 
         */
        public Builder copyrightHolder(@Nullable Output<String> copyrightHolder) {
            $.copyrightHolder = copyrightHolder;
            return this;
        }

        /**
         * @param copyrightHolder Complete this field if you want to include the name of the copyright holder in the copyright tag in the captions metadata.
         * 
         * @return builder
         * 
         */
        public Builder copyrightHolder(String copyrightHolder) {
            return copyrightHolder(Output.of(copyrightHolder));
        }

        /**
         * @param fillLineGap Specifies how to handle the gap between the lines (in multi-line captions). - enabled: Fill with the captions background color (as specified in the input captions). - disabled: Leave the gap unfilled.
         * 
         * @return builder
         * 
         */
        public Builder fillLineGap(@Nullable Output<String> fillLineGap) {
            $.fillLineGap = fillLineGap;
            return this;
        }

        /**
         * @param fillLineGap Specifies how to handle the gap between the lines (in multi-line captions). - enabled: Fill with the captions background color (as specified in the input captions). - disabled: Leave the gap unfilled.
         * 
         * @return builder
         * 
         */
        public Builder fillLineGap(String fillLineGap) {
            return fillLineGap(Output.of(fillLineGap));
        }

        /**
         * @param fontFamily Specifies the font family to include in the font data attached to the EBU-TT captions. Valid only if styleControl is set to include. If you leave this field empty, the font family is set to “monospaced”. (If styleControl is set to exclude, the font family is always set to “monospaced”.) You specify only the font family. All other style information (color, bold, position and so on) is copied from the input captions. The size is always set to 100%!t(MISSING)o allow the downstream player to choose the size. - Enter a list of font families, as a comma-separated list of font names, in order of preference. The name can be a font family (such as “Arial”), or a generic font family (such as “serif”), or “default” (to let the downstream player choose the font). - Leave blank to set the family to “monospace”.
         * 
         * @return builder
         * 
         */
        public Builder fontFamily(@Nullable Output<String> fontFamily) {
            $.fontFamily = fontFamily;
            return this;
        }

        /**
         * @param fontFamily Specifies the font family to include in the font data attached to the EBU-TT captions. Valid only if styleControl is set to include. If you leave this field empty, the font family is set to “monospaced”. (If styleControl is set to exclude, the font family is always set to “monospaced”.) You specify only the font family. All other style information (color, bold, position and so on) is copied from the input captions. The size is always set to 100%!t(MISSING)o allow the downstream player to choose the size. - Enter a list of font families, as a comma-separated list of font names, in order of preference. The name can be a font family (such as “Arial”), or a generic font family (such as “serif”), or “default” (to let the downstream player choose the font). - Leave blank to set the family to “monospace”.
         * 
         * @return builder
         * 
         */
        public Builder fontFamily(String fontFamily) {
            return fontFamily(Output.of(fontFamily));
        }

        /**
         * @param styleControl Specifies the style information (font color, font position, and so on) to include in the font data that is attached to the EBU-TT captions. - include: Take the style information (font color, font position, and so on) from the source captions and include that information in the font data attached to the EBU-TT captions. This option is valid only if the source captions are Embedded or Teletext. - exclude: In the font data attached to the EBU-TT captions, set the font family to “monospaced”. Do not include any other style information.
         * 
         * @return builder
         * 
         */
        public Builder styleControl(@Nullable Output<String> styleControl) {
            $.styleControl = styleControl;
            return this;
        }

        /**
         * @param styleControl Specifies the style information (font color, font position, and so on) to include in the font data that is attached to the EBU-TT captions. - include: Take the style information (font color, font position, and so on) from the source captions and include that information in the font data attached to the EBU-TT captions. This option is valid only if the source captions are Embedded or Teletext. - exclude: In the font data attached to the EBU-TT captions, set the font family to “monospaced”. Do not include any other style information.
         * 
         * @return builder
         * 
         */
        public Builder styleControl(String styleControl) {
            return styleControl(Output.of(styleControl));
        }

        public ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettingsArgs build() {
            return $;
        }
    }

}
