(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/center/center"],{"0cb9":function(e,t,n){"use strict";(function(e){n("bd28");r(n("66fd"));var t=r(n("9d7c"));function r(e){return e&&e.__esModule?e:{default:e}}e(t.default)}).call(this,n("543d")["createPage"])},1165:function(e,t,n){},"2ce9":function(e,t,n){"use strict";n.r(t);var r=n("8e06"),a=n.n(r);for(var u in r)"default"!==u&&function(e){n.d(t,e,(function(){return r[e]}))}(u);t["default"]=a.a},"4eb9":function(e,t,n){"use strict";var r;n.d(t,"b",(function(){return a})),n.d(t,"c",(function(){return u})),n.d(t,"a",(function(){return r}));var a=function(){var e=this,t=e.$createElement;e._self._c},u=[]},"8e06":function(e,t,n){"use strict";(function(e){Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var r=u(n("a34a")),a=u(n("55c1"));function u(e){return e&&e.__esModule?e:{default:e}}function c(e,t,n,r,a,u,c){try{var o=e[u](c),i=o.value}catch(s){return void n(s)}o.done?t(i):Promise.resolve(i).then(r,a)}function o(e){return function(){var t=this,n=arguments;return new Promise((function(r,a){var u=e.apply(t,n);function o(e){c(u,r,a,o,i,"next",e)}function i(e){c(u,r,a,o,i,"throw",e)}o(void 0)}))}}var i={data:function(){return{isH5Plus:!0,user:{},tableName:"",role:"",menuList:[]}},onLoad:function(){var t=this;return o(r.default.mark((function n(){var u,c,o;return r.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:return t.role=e.getStorageSync("role"),u=e.getStorageSync("nowTable"),n.next=4,t.$api.session(u);case 4:c=n.sent,t.user=c.data,t.tableName=u,o=a.default.list(),t.menuList=o;case 9:case"end":return n.stop()}}),n)})))()},onShow:function(){var t=this;return o(r.default.mark((function n(){var u,c,o;return r.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:return t.role=e.getStorageSync("role"),u=e.getStorageSync("nowTable"),n.next=4,t.$api.session(u);case 4:c=n.sent,t.user=c.data,t.tableName=u,o=a.default.list(),t.menuList=o;case 9:case"end":return n.stop()}}),n)})))()},methods:{onPageTap:function(t){e.navigateTo({url:t,fail:function(){e.switchTab({url:t})}})}}};t.default=i}).call(this,n("543d")["default"])},"9d7c":function(e,t,n){"use strict";n.r(t);var r=n("4eb9"),a=n("2ce9");for(var u in a)"default"!==u&&function(e){n.d(t,e,(function(){return a[e]}))}(u);n("c9b8");var c,o=n("f0c5"),i=Object(o["a"])(a["default"],r["b"],r["c"],!1,null,null,null,!1,r["a"],c);t["default"]=i.exports},c9b8:function(e,t,n){"use strict";var r=n("1165"),a=n.n(r);a.a}},[["0cb9","common/runtime","common/vendor"]]]);