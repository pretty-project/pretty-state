
(ns pretty-state.presets
    (:require [pretty-presets.api :as pretty-presets]
              [re-frame.extra.api :as r]
              [re-frame.tools.api :as re-frame.tools]
              [fruits.hiccup.api :as hiccup]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-focus-events
  ; @links
  ; [day8 / re-frame](https://github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](https://github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-focus-events' preset.
  ;
  ; @description
  ; Dispatches focus events as [Re-Frame metamorphic events](https://mt-extensions.github.io/re-frame-extra).
  ;
  ; @param (map) props
  ; {:on-blur-e (Re-Frame metamorphic event)(opt)
  ;  :on-focus-e (Re-Frame metamorphic event)(opt)
  ;  ...}
  ;
  ; @usage
  ; (dispatch-focus-events {:on-focus-e [:my-event] ...})
  ; =>
  ; {:on-focus-f #(dispatch [:my-event])
  ;  ...}
  ;
  ; @return (map)
  ; {:on-blur-f (function)
  ;  :on-focus-f (function)
  ;  ...}
  [{:keys [on-blur-e on-focus-e] :as props}]
  ; @note (#5671)
  ; 'set-*' and 'get-*' functions are exclusively overriden by handlers, while 'on-*' functions are extended with handlers.
  (cond-> props on-blur-e  (hiccup/merge-event-fn :on-blur-f  #(-> on-blur-e  (re-frame.tools/metamorphic-event<-params %) r/dispatch))
                on-focus-e (hiccup/merge-event-fn :on-focus-f #(-> on-focus-e (re-frame.tools/metamorphic-event<-params %) r/dispatch))))

(pretty-presets/reg-preset! :pretty-state/dispatch-focus-events dispatch-focus-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-image-events
  ; @links
  ; [day8 / re-frame](https://github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](https://github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-image-events' preset.
  ;
  ; @description
  ; Dispatches image events as [Re-Frame metamorphic events](https://mt-extensions.github.io/re-frame-extra).
  ;
  ; @param (map) props
  ; {:on-error-e (Re-Frame metamorphic event)(opt)
  ;  ...}
  ;
  ; @usage
  ; (dispatch-image-events {:on-error-e [:my-event] ...})
  ; =>
  ; {:on-error-f #(dispatch [:my-event])
  ;  ...}
  ;
  ; @return (map)
  ; {:on-error-f (function)
  ;  ...}
  [{:keys [on-error-e on-unerror-e] :as props}]
  ; @note (#5671)
  (cond-> props on-error-e (hiccup/merge-event-fn :on-error-f #(-> on-error-e (re-frame.tools/metamorphic-event<-params %) r/dispatch))))

(pretty-presets/reg-preset! :pretty-state/dispatch-image-events dispatch-image-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-input-field-events
  ; @links
  ; [day8 / re-frame](https://github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](https://github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-input-field-events' preset.
  ;
  ; @description
  ; Dispatches input field events as [Re-Frame metamorphic events](https://mt-extensions.github.io/re-frame-extra).
  ;
  ; @param (map) props
  ; {:on-change-e (Re-Frame metamorphic event)(opt)
  ;  :on-empty-e (Re-Frame metamorphic event)(opt)
  ;  :on-input-e (Re-Frame metamorphic event)(opt)
  ;  :on-type-ended-e (Re-Frame metamorphic event)(opt)
  ;  ...}
  ;
  ; @usage
  ; (dispatch-input-field-events {:on-type-ended-e [:my-event] ...})
  ; =>
  ; {:on-type-ended-f #(dispatch [:my-event])
  ;  ...}
  ;
  ; @return (map)
  ; {:on-change-f (function)
  ;  :on-empty-f (function)
  ;  :on-input-f (function)
  ;  :on-type-ended-f (function)
  ;  ...}
  [{:keys [on-change-e on-empty-e on-input-e on-type-ended-e] :as props}]
  ; @note (#5671)
  (cond-> props on-change-e     (hiccup/merge-event-fn :on-change-f     #(-> on-change-e     (re-frame.tools/metamorphic-event<-params %) r/dispatch))
                on-empty-e      (hiccup/merge-event-fn :on-empty-f      #(-> on-empty-e      (re-frame.tools/metamorphic-event<-params %) r/dispatch))
                on-input-e      (hiccup/merge-event-fn :on-input-f      #(-> on-input-e      (re-frame.tools/metamorphic-event<-params %) r/dispatch))
                on-type-ended-e (hiccup/merge-event-fn :on-type-ended-f #(-> on-type-ended-e (re-frame.tools/metamorphic-event<-params %) r/dispatch))))

(pretty-presets/reg-preset! :pretty-state/dispatch-input-field-events dispatch-input-field-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-input-numeric-events
  ; @links
  ; [day8 / re-frame](https://github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](https://github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-input-numeric-events' preset.
  ;
  ; @description
  ; Dispatches input numeric events as [Re-Frame metamorphic events](https://mt-extensions.github.io/re-frame-extra).
  ;
  ; @param (map) props
  ; {:on-decreased-e (Re-Frame metamorphic event)(opt)
  ;  :on-increased-e (Re-Frame metamorphic event)(opt)
  ;  ...}
  ;
  ; @usage
  ; (dispatch-input-numeric-events {:on-decreased-e [:my-event] ...})
  ; =>
  ; {:on-decreased-f #(dispatch [:my-event])
  ;  ...}
  ;
  ; @return (map)
  ; {:on-decreased-f (function)
  ;  :on-increased-f (function)
  ;  ...}
  [{:keys [on-decreased-e on-increased-e] :as props}]
  ; @note (#5671)
  (cond-> props on-decreased-e (hiccup/merge-event-fn :on-decreased-f #(-> on-decreased-e (re-frame.tools/metamorphic-event<-params %) r/dispatch))
                on-increased-e (hiccup/merge-event-fn :on-increased-f #(-> on-increased-e (re-frame.tools/metamorphic-event<-params %) r/dispatch))))

(pretty-presets/reg-preset! :pretty-state/dispatch-input-numeric-events dispatch-input-numeric-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-input-option-events
  ; @links
  ; [day8 / re-frame](https://github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](https://github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-input-option-events' preset.
  ;
  ; @description
  ; Dispatches input option events as [Re-Frame metamorphic events](https://mt-extensions.github.io/re-frame-extra).
  ;
  ; @param (map) props
  ; {:on-selected-e (Re-Frame metamorphic event)(opt)
  ;  :on-unselected-e (Re-Frame metamorphic event)(opt)
  ;  ...}
  ;
  ; @usage
  ; (dispatch-input-option-events {:on-selected-e [:my-event] ...})
  ; =>
  ; {:on-selected-f #(dispatch [:my-event])
  ;  ...}
  ;
  ; @return (map)
  ; {:on-selected-f (function)
  ;  :on-unselected-f (function)
  ;  ...}
  [{:keys [on-selected-e on-unselected-e] :as props}]
  ; @note (#5671)
  (cond-> props on-selected-e   (hiccup/merge-event-fn :on-selected-f   #(-> on-selected-e   (re-frame.tools/metamorphic-event<-params %) r/dispatch))
                on-unselected-e (hiccup/merge-event-fn :on-unselected-f #(-> on-unselected-e (re-frame.tools/metamorphic-event<-params %) r/dispatch))))

(pretty-presets/reg-preset! :pretty-state/dispatch-input-option-events dispatch-input-option-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-input-validation-events
  ; @links
  ; [day8 / re-frame](https://github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](https://github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-input-validation-events' preset.
  ;
  ; @description
  ; Dispatches input validation events as [Re-Frame metamorphic events](https://mt-extensions.github.io/re-frame-extra).
  ;
  ; @param (map) props
  ; {:on-invalid-e (Re-Frame metamorphic event)(opt)
  ;  :on-valid-e (Re-Frame metamorphic event)(opt)
  ;  ...}
  ;
  ; @usage
  ; (dispatch-input-validation-events {:on-invalid-e [:my-event] ...})
  ; =>
  ; {:on-invalid-f #(dispatch [:my-event])
  ;  ...}
  ;
  ; @return (map)
  ; {:on-invalid-f (function)
  ;  :on-valid-f (function)
  ;  ...}
  [{:keys [on-invalid-e on-valid-e] :as props}]
  ; @note (#5671)
  (cond-> props on-invalid-e (hiccup/merge-event-fn :on-invalid-f #(-> on-invalid-e (re-frame.tools/metamorphic-event<-params %) r/dispatch))
                on-valid-e   (hiccup/merge-event-fn :on-valid-f   #(-> on-valid-e   (re-frame.tools/metamorphic-event<-params %) r/dispatch))))

(pretty-presets/reg-preset! :pretty-state/dispatch-input-validation-events dispatch-input-validation-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-input-value-events
  ; @links
  ; [day8 / re-frame](https://github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](https://github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-input-value-events' preset.
  ;
  ; @description
  ; Dispatches input value events as [Re-Frame metamorphic events](https://mt-extensions.github.io/re-frame-extra).
  ;
  ; @param (map) props
  ; {:set-value-e (Re-Frame metamorphic event)(opt)
  ;  ...}
  ;
  ; @usage
  ; (dispatch-input-value-events {:set-value-e [:my-event] ...})
  ; =>
  ; {:set-value-f #(dispatch [:my-event])
  ;  ...}
  ;
  ; @return (map)
  ; {:set-value-f (function)
  ;  ...}
  [{:keys [set-value-e] :as props}]
  ; @note (#5671)
  (cond-> props set-value-e (assoc :set-value-f #(-> set-value-e (re-frame.tools/metamorphic-event<-params %) r/dispatch))))

(pretty-presets/reg-preset! :pretty-state/dispatch-input-value-events dispatch-input-value-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-keypress-events
  ; @links
  ; [day8 / re-frame](https://github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](https://github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-keypress-events' preset.
  ;
  ; @description
  ; Dispatches keypress events as [Re-Frame metamorphic events](https://mt-extensions.github.io/re-frame-extra).
  ;
  ; @param (map) props
  ; {:on-arrow-down-e (Re-Frame metamorphic event)(opt)
  ;  :on-arrow-left-e (Re-Frame metamorphic event)(opt)
  ;  :on-arrow-right-e (Re-Frame metamorphic event)(opt)
  ;  :on-arrow-up-e (Re-Frame metamorphic event)(opt)
  ;  :on-enter-e (Re-Frame metamorphic event)(opt)
  ;  :on-escape-e (Re-Frame metamorphic event)(opt)
  ;  ...}
  ;
  ; @usage
  ; (dispatch-keypress-events {:on-escape-e [:my-event] ...})
  ; =>
  ; {:on-escape-f #(dispatch [:my-event])
  ;  ...}
  ;
  ; @return (map)
  ; {:on-arrow-down-f (function)
  ;  :on-arrow-left-f (function)
  ;  :on-arrow-right-f (function)
  ;  :on-arrow-up-f (function)
  ;  :on-enter-f (function)
  ;  :on-escape-f (function)
  ;  ...}
  [{:keys [on-arrow-down-e on-arrow-left-e on-arrow-right-e on-arrow-up-e on-enter-e on-escape-e] :as props}]
  ; @note (#5671)
  (cond-> props on-arrow-down-e  (hiccup/merge-event-fn :on-arrow-down-f  #(r/dispatch on-arrow-down-e))
                on-arrow-left-e  (hiccup/merge-event-fn :on-arrow-left-f  #(r/dispatch on-arrow-left-e))
                on-arrow-right-e (hiccup/merge-event-fn :on-arrow-right-f #(r/dispatch on-arrow-right-e))
                on-arrow-up-e    (hiccup/merge-event-fn :on-arrow-up-f    #(r/dispatch on-arrow-up-e))
                on-enter-e       (hiccup/merge-event-fn :on-enter-f       #(r/dispatch on-enter-e))
                on-escape-e      (hiccup/merge-event-fn :on-escape-f      #(r/dispatch on-escape-e))))

(pretty-presets/reg-preset! :pretty-state/dispatch-keypress-events dispatch-keypress-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-lifecycle-events
  ; @links
  ; [day8 / re-frame](https://github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](https://github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-lifecycle-events' preset.
  ;
  ; @description
  ; Dispatches lifecycle events as [Re-Frame metamorphic events](https://mt-extensions.github.io/re-frame-extra).
  ;
  ; @param (map) props
  ; {:on-mount-e (Re-Frame metamorphic event)(opt)
  ;  :on-unmount-e (Re-Frame metamorphic event)(opt)
  ;  ...}
  ;
  ; @usage
  ; (dispatch-lifecycle-events {:on-mount-e [:my-event] ...})
  ; =>
  ; {:on-mount-f #(dispatch [:my-event])
  ;  ...}
  ;
  ; @return (map)
  ; {:on-mount-f (function)
  ;  :on-unmount-f (function)
  ;  ...}
  [{:keys [on-mount-e on-unmount-e] :as props}]
  ; @note (#5671)
  (cond-> props on-mount-e   (hiccup/merge-event-fn :on-mount-f   #(r/dispatch on-mount-e))
                on-unmount-e (hiccup/merge-event-fn :on-unmount-f #(r/dispatch on-unmount-e))))

(pretty-presets/reg-preset! :pretty-state/dispatch-lifecycle-events dispatch-lifecycle-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-mouse-events
  ; @links
  ; [day8 / re-frame](https://github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](https://github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-mouse-events' preset.
  ;
  ; @description
  ; Dispatches mouse events as [Re-Frame metamorphic events](https://mt-extensions.github.io/re-frame-extra).
  ;
  ; @param (map) props
  ; {:on-click-e (Re-Frame metamorphic event)(opt)
  ;  :on-mouse-down-e (Re-Frame metamorphic event)(opt)
  ;  :on-mouse-leave-e (Re-Frame metamorphic event)(opt)
  ;  :on-mouse-over-e (Re-Frame metamorphic event)(opt)
  ;  :on-mouse-up-e (Re-Frame metamorphic event)(opt)
  ;  :on-right-click-e (Re-Frame metamorphic event)(opt)
  ;  ...}
  ;
  ; @usage
  ; (dispatch-mouse-events {:on-click-e [:my-event] ...})
  ; =>
  ; {:on-click-f #(dispatch [:my-event])
  ;  ...}
  ;
  ; @return (map)
  ; {:on-click-f (function)
  ;  :on-mouse-down-f (function)
  ;  :on-mouse-leave-f (function)
  ;  :on-mouse-over-f (function)
  ;  :on-mouse-up-f (function)
  ;  :on-right-click-f (function)
  ;  ...}
  [{:keys [on-click-e on-mouse-down-e on-mouse-leave-e on-mouse-over-e on-mouse-up-e on-right-click-e] :as props}]
  ; @note (#5671)
  (cond-> props on-click-e       (hiccup/merge-event-fn :on-click-f       #(r/dispatch on-click-e))
                on-mouse-down-e  (hiccup/merge-event-fn :on-mouse-down-f  #(r/dispatch on-mouse-down-e))
                on-mouse-leave-e (hiccup/merge-event-fn :on-mouse-leave-f #(r/dispatch on-mouse-leave-e))
                on-mouse-over-e  (hiccup/merge-event-fn :on-mouse-over-f  #(r/dispatch on-mouse-over-e))
                on-mouse-up-e    (hiccup/merge-event-fn :on-mouse-up-f    #(r/dispatch on-mouse-up-e))
                on-right-click-e (hiccup/merge-event-fn :on-right-click-f #(r/dispatch on-right-click-e))))

(pretty-presets/reg-preset! :pretty-state/dispatch-mouse-events dispatch-mouse-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-react-events
  ; @links
  ; [day8 / re-frame](https://github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](https://github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-react-events' preset.
  ;
  ; @description
  ; Dispatches react events as [Re-Frame metamorphic events](https://mt-extensions.github.io/re-frame-extra).
  ;
  ; @param (map) props
  ; {:store-reference-e (Re-Frame metamorphic event)(opt)
  ;  ...}
  ;
  ; @usage
  ; (dispatch-react-events {:store-reference-e [:my-event] ...})
  ; =>
  ; {:store-reference-f #(dispatch [:my-event])
  ;  ...}
  ;
  ; @return (map)
  ; {:store-reference-f (function)
  ;  ...}
  [{:keys [store-reference-e] :as props}]
  ; @note (#5671)
  (cond-> props store-reference-e (assoc :store-reference-f #(-> store-reference-e (re-frame.tools/metamorphic-event<-params %) r/dispatch))))

(pretty-presets/reg-preset! :pretty-state/dispatch-react-events dispatch-react-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn subscribe-to-input-field-value
  ; @links
  ; [day8 / re-frame](https://github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](https://github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/subscribe-to-input-field-value' preset.
  ;
  ; @description
  ; Connects the input field to the Re-Frame state by ...
  ; ... subscribing its value from the given value path,
  ; ... writing its output to the given value path.
  ;
  ; @param (map) props
  ; {:value-path (Re-Frame state path)(opt)
  ;  ...}
  ;
  ; @usage
  ; (subscribe-to-input-field-value {:value-path [:my-value] ...})
  ; =>
  ; {:get-value-f     #(r/subscribed [:get-item  [:my-value]])
  ;  :on-blur-f       #(r/dispatch   [:set-item! [:my-value] %])
  ;  :on-type-ended-f #(r/dispatch   [:set-item! [:my-value] %])
  ;  :value-path      [:my-value]
  ;  ...}
  ;
  ; @return (map)
  ; {:get-value-f (function)
  ;  :on-blur-f (function)
  ;  :on-type-ended-f (function)
  ;  ...}
  [{:keys [value-path] :as props}]
  ; @note (#5671)
  ;
  ; @note (#5672)
  ; Writes the current field value to the state when the user stops typing,
  ; reducing the frequency of dispatch events (for improved performance).
  (cond-> props value-path (assoc                 :get-value-f     #(r/subscribed [:get-item value-path]))
                value-path (hiccup/merge-event-fn :on-blur-f       #(r/dispatch   [:set-item! value-path %]))
                value-path (hiccup/merge-event-fn :on-type-ended-f #(r/dispatch   [:set-item! value-path %]))))

(pretty-presets/reg-preset! :pretty-state/subscribe-to-input-field-value subscribe-to-input-field-value)

(defn subscribe-to-input-options
  ; @links
  ; [day8 / re-frame](https://github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](https://github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/subscribe-to-input-options' preset.
  ;
  ; @description
  ; Connects the selectable input to the Re-Frame state by ...
  ; ... subscribing its options from the given options path,
  ; ... subscribing its value from the given value path,
  ; ... writing its output to the given value path.
  ;
  ; @param (map) props
  ; {:options-path (Re-Frame state path)(opt)
  ;  :value-path (Re-Frame state path)(opt)
  ;  ...}
  ;
  ; @usage
  ; (subscribe-to-input-options {:options-path [:my-options] :value-path [:my-value] ...})
  ; =>
  ; {:get-options-f #(r/subscribed [:get-item  [:my-options]])
  ;  :get-value-f   #(r/subscribed [:get-item  [:my-value]])
  ;  :set-value-f   #(r/dispatch   [:set-item! [:my-value] %])
  ;  ...}
  ;
  ; @return (map)
  ; {:get-options-f (function)
  ;  :get-value-f (function)
  ;  :set-value-f (function)
  ;  ...}
  [{:keys [options-path value-path] :as props}]
  ; @note (#5671)
  (cond-> props options-path (assoc :get-options-f #(r/subscribed [:get-item  options-path]))
                value-path   (assoc :get-value-f   #(r/subscribed [:get-item  value-path]))
                value-path   (assoc :set-value-f   #(r/dispatch   [:set-item! value-path %]))))

(pretty-presets/reg-preset! :pretty-state/subscribe-to-input-options subscribe-to-input-options)
