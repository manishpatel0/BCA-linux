(function($) {

    jQuery(document).ready(function() {

        Panel.init();

        $(document).on('click', '.tab-controller', function() {
             Panel.togglePanel();
        });

    });

    var Panel = {

        isVisible : true,
        showMessage : null,
        hideMessage : null,
        animationDuration : 650,
        animationEasing : 'linear',

        init : function() {

        },

        hidePanel : function() {
            $('.panel-wrapper').animate({
                bottom : -(Panel.getAnimationOffset())
            }, Panel.animationDuration, Panel.animationEasing, function() {
                Panel.isVisible = false;
                Panel.updateTabMessage();
            });
        },

        showPanel : function() {
            $('.panel-wrapper').animate({
                bottom : 0
            }, Panel.animationDuration, Panel.animationEasing, function() {
                Panel.isVisible = true;
                Panel.updateTabMessage();
            });
        },

        togglePanel : function() {
            ((this.isVisible) ? this.hidePanel : this.showPanel)();
        },

        updateTabMessage : function() {
            if (this.isVisible) {
                $('.tab-controller .closee').show();
                $('.tab-controller .showw').hide();
            } else {
                $('.tab-controller .closee').hide();
                $('.tab-controller .showw').show();
            }
        },

        getAnimationOffset : function() {
            return $('.panel-content').height();
        }

    }

})(jQuery);