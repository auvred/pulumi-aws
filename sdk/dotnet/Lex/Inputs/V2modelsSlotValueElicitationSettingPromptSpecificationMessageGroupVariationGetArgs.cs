// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lex.Inputs
{

    public sealed class V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("customPayloads", required: true)]
        private InputList<object>? _customPayloads;
        public InputList<object> CustomPayloads
        {
            get => _customPayloads ?? (_customPayloads = new InputList<object>());
            set => _customPayloads = value;
        }

        [Input("imageResponseCard")]
        public Input<Inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardGetArgs>? ImageResponseCard { get; set; }

        [Input("plainTextMessage")]
        public Input<Inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationPlainTextMessageGetArgs>? PlainTextMessage { get; set; }

        [Input("ssmlMessage")]
        public Input<Inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationSsmlMessageGetArgs>? SsmlMessage { get; set; }

        public V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationGetArgs()
        {
        }
        public static new V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationGetArgs Empty => new V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationGetArgs();
    }
}
