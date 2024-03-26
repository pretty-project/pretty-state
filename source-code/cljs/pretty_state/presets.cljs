
(ns pretty-state.presets
    (:require [pretty-presets.api :as pretty-presets]
              [re-frame.extra.api :as r]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-focus-events
  ; @links
  ; [day8 / re-frame](github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-focus-events' preset.
  ;
  ; @description
  ; Dispatches focus events as [Re-Frame metamorphic events](mt-extensions.github.io/re-frame-extra).
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
  (merge (if on-blur-e  {:on-blur-f   #(r/dispatch on-blur-e)})
         (if on-focus-e {:on-focus-f  #(r/dispatch on-focus-e)})
         (-> props)))

(pretty-presets/reg-preset! :pretty-state/dispatch-focus-events dispatch-focus-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-image-events
  ; @links
  ; [day8 / re-frame](github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-image-events' preset.
  ;
  ; @description
  ; Dispatches image events as [Re-Frame metamorphic events](mt-extensions.github.io/re-frame-extra).
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
  (merge (if on-error-e {:on-error-f #(r/dispatch on-error-e)})
         (-> props)))

(pretty-presets/reg-preset! :pretty-state/dispatch-image-events dispatch-image-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-input-field-events
  ; @links
  ; [day8 / re-frame](github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-input-field-events' preset.
  ;
  ; @description
  ; Dispatches input field events as [Re-Frame metamorphic events](mt-extensions.github.io/re-frame-extra).
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
  (merge (if on-change-e     {:on-change-f     #(r/dispatch on-change-e)})
         (if on-empty-e      {:on-empty-f      #(r/dispatch on-empty-e)})
         (if on-input-e      {:on-input-f      #(r/dispatch on-input-e)})
         (if on-type-ended-e {:on-type-ended-f #(r/dispatch on-type-ended-e)})
         (-> props)))

(pretty-presets/reg-preset! :pretty-state/dispatch-input-field-events dispatch-input-field-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-input-numeric-events
  ; @links
  ; [day8 / re-frame](github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-input-numeric-events' preset.
  ;
  ; @description
  ; Dispatches input numeric events as [Re-Frame metamorphic events](mt-extensions.github.io/re-frame-extra).
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
  (merge (if on-decreased-e {:on-decreased-f #(r/dispatch on-decreased-e)})
         (if on-increased-e {:on-increased-f #(r/dispatch on-increased-e)})
         (-> props)))

(pretty-presets/reg-preset! :pretty-state/dispatch-input-numeric-events dispatch-input-numeric-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-input-option-events
  ; @links
  ; [day8 / re-frame](github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-input-option-events' preset.
  ;
  ; @description
  ; Dispatches input option events as [Re-Frame metamorphic events](mt-extensions.github.io/re-frame-extra).
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
  (merge (if on-selected-e   {:on-selected-f   #(r/dispatch on-selected-e)})
         (if on-unselected-e {:on-unselected-f #(r/dispatch on-unselected-e)})
         (-> props)))

(pretty-presets/reg-preset! :pretty-state/dispatch-input-option-events dispatch-input-option-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-input-validation-events
  ; @links
  ; [day8 / re-frame](github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-input-validation-events' preset.
  ;
  ; @description
  ; Dispatches input validation events as [Re-Frame metamorphic events](mt-extensions.github.io/re-frame-extra).
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
  (merge (if on-invalid-e {:on-invalid-f #(r/dispatch on-invalid-e)})
         (if on-valid-e   {:on-valid-f   #(r/dispatch on-valid-e)})
         (-> props)))

(pretty-presets/reg-preset! :pretty-state/dispatch-input-validation-events dispatch-input-validation-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-input-value-events
  ; @links
  ; [day8 / re-frame](github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-input-value-events' preset.
  ;
  ; @description
  ; Dispatches input value events as [Re-Frame metamorphic events](mt-extensions.github.io/re-frame-extra).
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
  (merge (if set-value-e {:set-value-f #(r/dispatch set-value-e)})
         (-> props)))

(pretty-presets/reg-preset! :pretty-state/dispatch-input-value-events dispatch-input-value-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-keypress-events
  ; @links
  ; [day8 / re-frame](github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-keypress-events' preset.
  ;
  ; @description
  ; Dispatches keypress events as [Re-Frame metamorphic events](mt-extensions.github.io/re-frame-extra).
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
  (merge (if on-arrow-down-e  {:on-arrow-down-f  #(r/dispatch on-arrow-down-e)})
         (if on-arrow-left-e  {:on-arrow-left-f  #(r/dispatch on-arrow-left-e)})
         (if on-arrow-right-e {:on-arrow-right-f #(r/dispatch on-arrow-right-e)})
         (if on-arrow-up-e    {:on-arrow-up-f    #(r/dispatch on-arrow-up-e)})
         (if on-enter-e       {:on-enter-f       #(r/dispatch on-enter-e)})
         (if on-escape-e      {:on-escape-f      #(r/dispatch on-escape-e)})
         (-> props)))

(pretty-presets/reg-preset! :pretty-state/dispatch-keypress-events dispatch-keypress-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-lifecycle-events
  ; @links
  ; [day8 / re-frame](github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-lifecycle-events' preset.
  ;
  ; @description
  ; Dispatches lifecycle events as [Re-Frame metamorphic events](mt-extensions.github.io/re-frame-extra).
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
  (merge (if on-mount-e   {:on-mount-f    #(r/dispatch on-mount-e)})
         (if on-unmount-e {:on-unmount-f  #(r/dispatch on-unmount-e)})
         (-> props)))

(pretty-presets/reg-preset! :pretty-state/dispatch-lifecycle-events dispatch-lifecycle-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-mouse-events
  ; @links
  ; [day8 / re-frame](github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-mouse-events' preset.
  ;
  ; @description
  ; Dispatches mouse events as [Re-Frame metamorphic events](mt-extensions.github.io/re-frame-extra).
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
  (merge (if on-click-e       {:on-click-f       #(r/dispatch on-click-e)})
         (if on-mouse-down-e  {:on-mouse-down-f  #(r/dispatch on-mouse-down-e)})
         (if on-mouse-leave-e {:on-mouse-leave-f #(r/dispatch on-mouse-leave-e)})
         (if on-mouse-over-e  {:on-mouse-over-f  #(r/dispatch on-mouse-over-e)})
         (if on-mouse-up-e    {:on-mouse-up-f    #(r/dispatch on-mouse-up-e)})
         (if on-right-click-e {:on-right-click-f #(r/dispatch on-right-click-e)})
         (-> props)))

(pretty-presets/reg-preset! :pretty-state/dispatch-mouse-events dispatch-mouse-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn dispatch-react-events
  ; @links
  ; [day8 / re-frame](github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](github.com/mt-extensions/re-frame-extra)
  ;
  ; @note
  ; Registered as ':pretty-state/dispatch-react-events' preset.
  ;
  ; @description
  ; Dispatches react events as [Re-Frame metamorphic events](mt-extensions.github.io/re-frame-extra).
  ;
  ; @param (map) props
  ; {:set-reference-e (Re-Frame metamorphic event)(opt)
  ;  ...}
  ;
  ; @usage
  ; (dispatch-react-events {:set-reference-e [:my-event] ...})
  ; =>
  ; {:set-reference-f #(dispatch [:my-event])
  ;  ...}
  ;
  ; @return (map)
  ; {:set-reference-f (function)
  ;  ...}
  [{:keys [set-reference-e] :as props}]
  (merge (if set-reference-e {:set-reference-f #(r/dispatch set-reference-e)})
         (-> props)))

(pretty-presets/reg-preset! :pretty-state/dispatch-react-events dispatch-react-events)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn subscribe-to-input-field-value
  ; @links
  ; [day8 / re-frame](github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](github.com/mt-extensions/re-frame-extra)
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
  ; Writes the current field value to the state when the user stops typing,
  ; reducing the frequency of dispatch events (for improved performance).
  (merge (if value-path {:get-value-f     #(r/subscribed [:get-item  value-path])})
         (if value-path {:on-blur-f       #(r/dispatch   [:set-item! value-path %])})
         (if value-path {:on-type-ended-f #(r/dispatch   [:set-item! value-path %])})
         (-> props)))

(pretty-presets/reg-preset! :pretty-state/subscribe-to-input-field-value subscribe-to-input-field-value)

(defn subscribe-to-input-options
  ; @links
  ; [day8 / re-frame](github.com/day8/re-frame)
  ; [mt-extensions / re-frame-extra](github.com/mt-extensions/re-frame-extra)
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
  (merge (if options-path {:get-options-f #(r/subscribed [:get-item  options-path])})
         (if value-path   {:get-value-f   #(r/subscribed [:get-item  value-path])})
         (if value-path   {:set-value-f   #(r/dispatch   [:set-item! value-path %])})
         (-> props)))

(pretty-presets/reg-preset! :pretty-state/subscribe-to-input-options subscribe-to-input-options)
