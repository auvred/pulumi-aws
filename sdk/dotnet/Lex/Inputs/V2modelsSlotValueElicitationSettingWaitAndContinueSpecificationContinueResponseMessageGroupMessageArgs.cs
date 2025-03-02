// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lex.Inputs
{

    public sealed class V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs : global::Pulumi.ResourceArgs
    {
        [Input("customPayloads", required: true)]
        private InputList<object>? _customPayloads;
        public InputList<object> CustomPayloads
        {
            get => _customPayloads ?? (_customPayloads = new InputList<object>());
            set => _customPayloads = value;
        }

        [Input("imageResponseCard")]
        public Input<Inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardArgs>? ImageResponseCard { get; set; }

        [Input("plainTextMessage")]
        public Input<Inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessagePlainTextMessageArgs>? PlainTextMessage { get; set; }

        [Input("ssmlMessage")]
        public Input<Inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageSsmlMessageArgs>? SsmlMessage { get; set; }

        public V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs()
        {
        }
        public static new V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs Empty => new V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs();
    }
}
