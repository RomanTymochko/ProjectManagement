package pl.edu.wsb.projectmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

//        String[] names = {
//                "load",
//                "display",
//                "block",
//                "css",
//                ".menu",
//                "preloader-hide",
//                "addClass",
//                "#preloader",
//                "on",
//                "use strict",
//                "click",
//                "#",
//                "href",
//                "attr",
//                "a",
//                "length",
//                ".menu-hider",
//                "<div class=\"menu-hider\"><div>",
//                "append",
//                "#page",
//                "body",
//                ".nav-fixed",
//                "#footer-bar",
//                ".close-menu",
//                ".header",
//                ".page-content",
//                ".header, .page-content, #footer-bar",
//                "[data-toggle-theme-switch], [data-toggle-theme], [data-toggle-theme-switch] input, [data-toggle-theme] input",
//                "theme-dark",
//                "theme-light",
//                "removeClass",
//                "disabled",
//                "#dark-mode-detected",
//                "Appkit-Theme",
//                "dark-mode",
//                "setItem",
//                "light-mode",
//                "matches",
//                "(prefers-color-scheme: dark)",
//                "matchMedia",
//                "(prefers-color-scheme: light)",
//                "(prefers-color-scheme: no-preference)",
//                "addListener",
//                "#manual-mode-detected",
//                "<style id=\"transitions-remove\">.btn, .header, #footer-bar, .menu-box, .menu-active{transition:all 0ms ease!important;}</style>",
//                "theme-light theme-dark",
//                "toggleClass",
//                "detect-theme",
//                "hasClass",
//                "checked",
//                "prop",
//                "remove",
//                "#transitions-remove",
//                "find",
//                "off",
//                "[data-toggle-theme], [data-toggle-theme-switch]",
//                "getItem",
//                ".detect-dark-mode",
//                ".disable-auto-dark-mode",
//                ".footer-bar-2, .footer-bar-4, .footer-bar-5, .footer-bar-6",
//                ".footer-bar-1 strong, .footer-bar-2 strong, .footer-bar-4 strong, .footer-bar-5 strong, .footer-bar-6 strong",
//                "<strong><u></u></strong>",
//                ".footer-bar-1 .active-nav, .footer-bar-2 .active-nav, .footer-bar-4 .active-nav, .footer-bar-5 .active-nav, .footer-bar-6 .circle-nav",
//                "<em></em>",
//                ".footer-bar-6 .active-nav",
//                "z_AppKit-Visited:",
//                "pathname",
//                "location",
//                "Page Visited",
//                "visited",
//                "fn",
//                "host",
//                "/",
//                ".badge",
//                "data-visited",
//                "each",
//                "z_Appkit-Visited-Scroll-Position",
//                "scrollTop",
//                ".list-group a",
//                ".check-visited",
//                "removeItem",
//                "visited-link",
//                ".check-visited a",
//                "go",
//                "history",
//                ".back-button, [data-back-button]",
//                ".copyright-year, #copyright-year",
//                "getFullYear",
//                "html",
//                ".back-to-top-badge, .back-to-top-icon",
//                "preventDefault",
//                "animate",
//                "html, body, .page-content",
//                ".back-to-top, [data-back-to-top], .back-to-top-badge, .back-to-top-icon",
//                "back-to-top-visible",
//                "none",
//                "#adblock-detect img",
//                "#adblock-message",
//                "#adblock-message, #adblock-detect",
//                "#scroll-ad",
//                "#fixed-ad",
//                ".activate-scroll-ad",
//                ".activate-fixed-ad",
//                ".scroll-ad",
//                "scroll-ad-visible",
//                "height",
//                ".page-content-top",
//                ".page-content-top-clear",
//                "scroll",
//                ".page-title",
//                "scrollHeight",
//                "header-active",
//                ".header-auto-show",
//                "opacity",
//                "0",
//                "1",
//                ".visit-detection",
//                "Appkit-Last-Visited",
//                "getMonth",
//                "getDate",
//                "getHours",
//                ":",
//                "getMinutes",
//                "getSeconds",
//                ".visit-before-time",
//                "hide",
//                ".never-visited",
//                "show",
//                ".before-visited",
//                "<br>Your last visit was ",
//                " at ",
//                ".tab-controls",
//                ".tab-controls a",
//                "tab-items",
//                "data",
//                "parent",
//                "width",
//                "a[data-tab-active]",
//                "tab",
//                "tab-active",
//                "%",
//                "a[data-tab]",
//                "slideDown",
//                ".tab-content",
//                "tab-order",
//                "no-click",
//                "slideUp",
//                "font-size",
//                "+=1",
//                ".text-size-changer *",
//                ".text-size-increase",
//                "-=1",
//                ".text-size-decrease",
//                "",
//                ".text-size-default",
//                "keyup",
//                "val",
//                ".search-results",
//                "[data-filter-item]",
//                "[data-filter-item][data-filter-name*=\"",
//                "toLowerCase",
//                "\"]",
//                "test",
//                "log",
//                ".search-results [data-filter-item]",
//                ".search-no-results",
//                "[data-filter-item].disabled",
//                "[data-search]",
//                "owlCarousel",
//                ".user-slider",
//                ".news-slider",
//                ".topic-slider",
//                ".story-slider",
//                ".single-slider",
//                ".fast-slider",
//                ".boxed-slider",
//                ".card-slider",
//                ".cover-slider",
//                ".double-slider",
//                ".task-slider",
//                "next.owl.carousel",
//                "trigger",
//                ".owl-carousel",
//                ".next-slide, .next-slide-arrow, .next-slide-text, .cover-next",
//                "prev.owl.carousel",
//                ".prev-slide, .prev-slide-arrow, .prev-slide-text, .cover-prev",
//                "closest",
//                ".next-slide-user",
//                ".prev-slide-user",
//                "bg-highlight",
//                ".owl-prev, .owl-next",
//                "any",
//                "match",
//                "userAgent",
//                "iOS",
//                "is-not-ios",
//                ".show-ios, .show-android",
//                ".show-no-device",
//                "<meta name=\"theme-color\" content=\"#FFFFFF\"> />",
//                "head",
//                ".show-android",
//                ".show-ios, .show-no-device, .simulate-android, .simulate-iphones",
//                "is-ios",
//                ".show-ios",
//                ".show-android, .show-no-device, .simulate-android, .simulate-iphones",
//                "toast",
//                ".toast, .snackbar-toast, .notification",
//                "[data-toast]",
//                "dismiss",
//                "[data-dismiss]",
//                "tooltip",
//                "[data-toggle=\"tooltip\"]",
//                "[data-toggle=\"collapse\"]",
//                "input",
//                ".stepper-add",
//                ".stepper-sub",
//                "id",
//                "[data-switch=",
//                "]",
//                "toggle",
//                "stop",
//                ".ios-input, .android-input, .classic-input",
//                "activate",
//                "[data-activate]",
//                "trigger-switch",
//                "[data-trigger-switch]",
//                ".business-hours",
//                ".is-on-homescreen",
//                "min-height",
//                ".page-content, #page",
//                "innerHeight",
//                ".card-full",
//                "card-height",
//                "cover",
//                ".map-full, .map-full iframe",
//                "cover-card",
//                "story-card",
//                "[data-card-height]",
//                "menu-active",
//                ".highlight-changer a",
//                "highlight-style",
//                "AppKit-Highlight",
//                "#highlight",
//                "<link rel=\"stylesheet\" id=\"highlight\" type=\"text/css\" />",
//                "[data-highlight-style]",
//                "a[data-highlight-style=\"",
//                "now",
//                "day-",
//                "en",
//                "long",
//                "toLocaleDateString",
//                ".",
//                "closed-message",
//                "closed-message-under",
//                "opened-message",
//                "opened-message-under",
//                "open",
//                "[data-monday]",
//                "close",
//                "08:00",
//                "17:00",
//                "17:30",
//                "09:00",
//                "18:55",
//                "12:00",
//                "bg-green-dark is-business-opened",
//                "bg-red-dark is-business-closed",
//                "openingTimes",
//                "is-business-opened",
//                ".show-business-opened",
//                ".show-business-closed",
//                "h1",
//                "p",
//                "#business-hours-mail",
//                "bg-green-dark",
//                "#business-hours-call",
//                "bg-red-dark",
//                "color-white",
//                "navigator",
//                "standalone",
//                "target",
//                "nodeName",
//                "parentNode",
//                "http",
//                "indexOf",
//                "addEventListener",
//                ".add-to-home",
//                "is-on-homescreen",
//                "add-to-home-visible add-to-home-android",
//                "add-to-home-ios",
//                ".simulate-android-badge",
//                "add-to-home-visible add-to-home-ios",
//                "add-to-home-android",
//                ".simulate-iphone-badge",
//                "add-to-home-visible",
//                "#menu-install-pwa-android, .menu-hider",
//                ".simulate-android-banner",
//                "#menu-install-pwa-ios, .menu-hider",
//                ".simulate-ios-banner",
//                "resize",
//                "deactivate-map",
//                ".map-full .caption",
//                ".map-but-1, .map-but-2",
//                "activate-map",
//                ".map-full .hide-map",
//                ".show-map, .hide-map",
//                "mouseenter mouseleave touchstart touchend",
//                "card-scale-image",
//                "img",
//                "bind",
//                "unbind",
//                ".card-scale",
//                "card-grayscale-image",
//                ".card-grayscale",
//                "card-rotate-image",
//                ".card-rotate",
//                "card-blur-image",
//                ".card-blur",
//                "card-hide-image",
//                ".card-center, .card-bottom, .card-top, .card-overlay",
//                ".card-hide",
//                " ",
//                "split",
//                "text",
//                "floor",
//                ".reading-progress-words",
//                ".reading-progress-time",
//                "#reading-progress-text",
//                ".menuHider",
//                "[data-auto-show-ad]",
//                "auto-show-ad",
//                "timed-ad",
//                "menu",
//                ".ad-time-close",
//                ".ad-time-close i",
//                ".ad-time-close span",
//                "[data-timed-ad]",
//                "01/19/2030 03:14:07 AM",
//                "getTime",
//                "getUTCFullYear",
//                "getUTCMonth",
//                "getUTCDate",
//                "getUTCHours",
//                "getUTCMinutes",
//                "getUTCSeconds",
//                ".countdown",
//                "innerHTML",
//                ".countdown #years",
//                ".countdown #days",
//                ".countdown #hours",
//                "slice",
//                ".countdown #minutes",
//                ".countdown #seconds",
//                "rotate-180",
//                ".accordion-icon",
//                "true",
//                "aria-expanded",
//                ".accordion-btn",
//                "caption-scale-image",
//                ".caption-scale",
//                "caption-grayscale-image",
//                ".caption-grayscale",
//                "caption-rotate-image",
//                ".caption-rotate",
//                "caption-blur-image",
//                ".caption-blur",
//                "caption-hide-image",
//                ".caption-center, .caption-bottom, .caption-top, .caption-overlay",
//                ".caption-hide",
//                ".upload-file",
//                "files",
//                "onload",
//                "src",
//                "result",
//                ".file-data img",
//                "class",
//                "img-fluid rounded-xs mt-4",
//                "readAsDataURL",
//                "name",
//                ".upload-file-data",
//                ".upload-file-name",
//                "lastModifiedDate",
//                ".upload-file-modified",
//                "size",
//                "kb",
//                ".upload-file-size",
//                "type",
//                ".upload-file-type",
//                "change",
//                ".todo-list",
//                ".form-check-input",
//                "opacity-70",
//                ".todo-list a",
//                "removeAttr",
//                ".check-card",
//                ".check-age",
//                "active",
//                "#date-birth-day",
//                "#date-birth-month",
//                "#date-birth-year",
//                "setFullYear",
//                "above 18",
//                "#menu-age",
//                "#menu-age-okay",
//                "#menu-age-fail",
//                ".get-location",
//                "geolocation",
//                "Your browser and device <strong class=\"color-green-dark\">support</strong> Geolocation.",
//                ".location-support",
//                "Your browser and device <strong class=\"color-red-dark\">support</strong> Geolocation.",
//                ".location-coordinates",
//                "querySelector",
//                "textContent",
//                "Locating",
//                "latitude",
//                "coords",
//                "longitude",
//                "<strong>Longitude:</strong> ",
//                "<br><strong>Latitude:</strong> ",
//                "http://maps.google.com/maps?q=",
//                ",",
//                "&z=18&t=h&output=embed",
//                "&z=18&t=h",
//                "<iframe class=\"location-map\" src=\"",
//                "\"></iframe> <div class=\"clearfix\"></div>",
//                "after",
//                ".location-map",
//                " <a href=",
//                " class=\"btn btn-full btn-l bg-red-dark rounded-0 font-700 mb-n1\">View on Google Maps</a>",
//                "Unable to retrieve your location",
//                "getCurrentPosition",
//                "Geolocation is not supported by your browser",
//                "<i class='fa fa-check color-green-dark'></i>",
//                "<i class='fa fa-exclamation-triangle color-red-light'></i>",
//                "title",
//                "https://www.facebook.com/sharer/sharer.php?u=",
//                ".shareToFacebook",
//                "https://www.linkedin.com/shareArticle?mini=true&url=",
//                "&title=",
//                "&summary=&source=",
//                ".shareToLinkedIn",
//                "https://twitter.com/home?status=",
//                ".shareToTwitter",
//                "https://pinterest.com/pin/create/button/?url=",
//                ".shareToPinterest",
//                "whatsapp://send?text=",
//                ".shareToWhatsApp",
//                "mailto:?body=",
//                ".shareToMail",
//                "Link Copied",
//                "color-green-dark",
//                "color-blue-dark",
//                "i",
//                "fa fa-check font-12",
//                "Copy Link",
//                ".shareToCopyLink",
//                "fa fa-link font-14",
//                "<input>",
//                "select",
//                "copy",
//                "execCommand",
//                "focusin keyup",
//                "span",
//                "input-style-1-inactive",
//                "input-style-1-active",
//                "input-style-1-inactive input-style-1-active",
//                ".input-required input, .input-required select, .input-required textarea",
//                "focusout",
//                "value",
//                "default",
//                "em",
//                ".input-required select",
//                "(required)",
//                ".input-required input[type=\"email\"]",
//                ".input-required input[type=\"tel\"]",
//                ".input-required input[type=\"password\"]",
//                ".input-required input[type=\"url\"]",
//                ".input-required input[type=\"name\"]",
//                ".input-required textarea",
//                "toDateInputValue",
//                "prototype",
//                "getTimezoneOffset",
//                "setMinutes",
//                "toJSON",
//                "input[type=\"date\"]",
//                ".generate-qr-result, .generate-qr-auto",
//                "https://api.qrserver.com/v1/create-qr-code/?size=200x200&data=",
//                ".generate-qr-auto",
//                "fa-exclamation-triangle",
//                ".fa",
//                "Invalid URL",
//                ".generate-qr-input",
//                "empty",
//                ".generate-qr-result",
//                "<img class=\"mx-auto polaroid-effect shadow-l mt-4 delete-qr\" width=\"200\" src=\"",
//                "\" alt=\"img\"><p class=\"font-11 text-center mb-0\">",
//                "</p>",
//                ".generate-qr-button",
//                "[data-vibrate]",
//                "vibrate",
//                ".vibrate-demo",
//                ".start-vibrating",
//                ".stop-vibrating",
//                ".preload-img",
//                "lazyload",
//                "default-link",
//                "[data-lightbox]",
//                "option",
//                "swipe",
//                "direction",
//                "gesture",
//                "#lightbox a.lb-prev",
//                "#lightbox a.lb-next",
//                "hammer",
//                "#lightbox",
//                ".gallery-filter-links",
//                "filterizr",
//                "color-highlight",
//                ".gallery-filter-active",
//                ".gallery-filter-select",
//                "[data-filter=",
//                "#filter-select",
//                "gallery-filter-active color-highlight",
//                ".gallery-filter-controls li",
//                ".gallery-views",
//                ".gallery-view-controls a",
//                ".gallery-view-1-activate",
//                ".gallery-view-2-activate",
//                ".gallery-view-3-activate",
//                "gallery-views gallery-view-1",
//                "gallery-views gallery-view-2",
//                "gallery-views gallery-view-3",
//                "false",
//                ".formValidationError",
//                "fieldHasError",
//                ".fieldHasError",
//                "data-dummy",
//                "focus",
//                "fadeIn",
//                "Error",
//                "requiredEmailField",
//                "Error2",
//                " .requiredField",
//                "serialize",
//                "action",
//                ".contact-form",
//                ".formSuccessMessageWrap",
//                "post",
//                "fadeOut",
//                "input[type=\"text\"], input[type=\"password\"], textarea",
//                "blur",
//                "input, textarea",
//                "data-formId",
//                ".contactSubmitButton",
//                "ready",
//                ".chart",
//                "scripts/charts.js",
//                "#wallet-chart",
//                "#pie-chart",
//                "#doughnut-chart",
//                "#polar-chart",
//                "#vertical-chart",
//                "#horizontal-chart",
//                "#line-chart",
//                "bar",
//                "Jun",
//                "Jul",
//                "Aug",
//                "Expenses",
//                "#ED5565",
//                "Income",
//                "#A0D468",
//                "Subscriptions",
//                "#4A89DC",
//                "bottom",
//                "pie",
//                "Facebook",
//                "Twitter",
//                "WhatsApp",
//                "#4FC1E9",
//                "rgba(255,255,255,0.5)",
//                "doughnut",
//                "Apple",
//                "Samsung",
//                "Google",
//                "#CCD1D9",
//                "#5D9CEC",
//                "#FC6E51",
//                "polarArea",
//                "Windows",
//                "Mac",
//                "Linux",
//                "2010",
//                "2015",
//                "2020",
//                "Android",
//                "horizontalBar",
//                "2013",
//                "2016",
//                "Mobile",
//                "#BF263C",
//                "Responsive",
//                "#EC87C0",
//                "line",
//                "Desktop Web",
//                "#D8334A",
//                "Mobile Web",
//                "script",
//                "createElement",
//                "onreadystatechange",
//                "appendChild",
//                "Appkit-PWA-Timeout-Value",
//                "Appkit-PWA-Prompt",
//                "User Closed Add to Home / PWA Prompt",
//                "install-rejected",
//                "#menu-install-pwa-android, #menu-install-pwa-ios, .menu-hider",
//                ".pwa-dismiss",
//                "(display-mode: standalone)",
//                "beforeinstallprompt",
//                "#menu-install-pwa-android, .add-to-home",
//                "Triggering PWA Window for Android",
//                "PWA Install Rejected. Will Show Again in ",
//                " Days",
//                "The div #menu-install-pwa-android was not found. Please add this div to show the install window",
//                "prompt",
//                "outcome",
//                "then",
//                "userChoice",
//                ".pwa-install",
//                "appinstalled",
//                "offline-message-active",
//                ".offline-message",
//                "online-message-active",
//                ".online-message",
//                "#menu-install-pwa-ios, .add-to-home",
//                "Triggering PWA Window for iOS",
//                "The div #menu-install-pwa-ios was not found. Please add this div to show the install window",
//                "<p class=\"offline-message bg-red-dark color-white center-text uppercase ultrabold\">No internet connection detected</p> ",
//                "<p class=\"online-message bg-green-dark color-white center-text uppercase ultrabold\">You are back online</p>",
//                ".simulate-offline",
//                ".simulate-online",
//                "online",
//                "onLine",
//                "Connection: Online",
//                "offline",
//                "Connection: Offline",
//                "workbox-runtime",
//                "delete",
//                "clear",
//                "forEach",
//                "keys",
//                "[data-menu]",
//                "menu-height",
//                "menu-width",
//                "menu-box-right",
//                "menu-box-left",
//                "menu-box-bottom",
//                "menu-box-top",
//                "menu-box-modal",
//                "modal-open",
//                ".menu a",
//                "menu-effect",
//                "menu-header-clear",
//                "menu-active-clear",
//                "footer-menu-hidden",
//                "menu-parallax",
//                "transform",
//                "translateY(",
//                "px)",
//                "translateX(",
//                "menu-push",
//                "menu-push-full",
//                "translateX(100%)",
//                "translateX(-100%)",
//                "menu-hide",
//                "menu-active menu-active-clear no-click",
//                "translate(0,0)",
//                "[data-auto-activate]",
//                "auto-activate",
//                "menu-active menu-active-clear",
//                ".menu-hider, .close-menu, .menu-close",
//                "#menu-main",
//                "nav-item-active",
//                "rotate-90",
//                ".fa-chevron-right",
//                "submenu",
//                "slideToggle",
//                "[data-submenu]",
//                "children",
//                "strong",
//                ".nav-item-active",
//                "done",
//                "promise",
//                "menu-load",
//                "[data-menu-load]",
//                "file:",
//                "protocol",
//                "mouseover",
//                "You are seeing these errors because your file is on your local computer. For real life simulations please use a Live Server or a Local Server such as AMPPS or WAMPP or simulate a  Live Preview using a Code Editor like http://brackets.io (it's 100% free) - PWA functions and AJAX Page Transitions will only work in these scenarios.",
//                "showMenu",
//                "hideMenu",
//                ".default-link",
//                "contactForm",
//                "is-exiting",
//                ".menu, .menu-hider",
//                "scrollRestoration",
//                "manual",
//                "smoothState",
//                 "serviceWorker",
//                 "/products/appkit/_service-worker.js",
//                 "/products/appkit/",
//                "register"};
//
//        String text = "";
//
//
//        for (int i=0; i<names.length;i++){
//            text = text.replaceAll("_0x3d60\\Q[\\E"+i+"\\Q]\\E", ""+names[i]+"");
//        }
//
//        System.out.println(text);
    }
}