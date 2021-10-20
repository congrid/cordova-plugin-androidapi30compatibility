"use strict";

var exports = {};

exports.compatibilize = function () {
  cordova.exec(
    function (ret) {
      console.info('AndroidApi30CompatibilityPlugin', ret);
    },
    function (err) {
      console.error('AndroidApi30CompatibilityPluginError', err);
    },
    "AndroidApi30CompatibilityPlugin",
    "compatibilize",
    []
  );
};


module.exports = exports;
