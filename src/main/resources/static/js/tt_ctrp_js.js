jQuery(document).ready(function(){
	
	var tt_ctrp_ajax_handler_action = '?action=tt_ctrp_ajax_handler';
	
	// Division
    jQuery("#tt_tuner_profile_division").remoteChainedTo({
        parents : "#tt_tuner_profile_country",
        url : tt_ctrp_ajax_object.tt_ctrp_ajax_url+tt_ctrp_ajax_handler_action,
		depends : "#tt_ctrp_ajax_nonce"
    });
	
	// District
	jQuery("#tt_tuner_profile_district").remoteChainedTo({
        parents : "#tt_tuner_profile_division",
        url : tt_ctrp_ajax_object.tt_ctrp_ajax_url+tt_ctrp_ajax_handler_action,
		depends : "#tt_ctrp_ajax_nonce"
    });
	
	// Sub District
	jQuery("#tt_tuner_profile_subdistrict").remoteChainedTo({
        parents : "#tt_tuner_profile_district",
        url : tt_ctrp_ajax_object.tt_ctrp_ajax_url+tt_ctrp_ajax_handler_action,
		depends : "#tt_tuner_profile_division,#tt_ctrp_ajax_nonce"
    });

});