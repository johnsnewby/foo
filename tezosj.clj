(import milfont.com.tezosj.helper.Global
        milfont.com.tezosj.model.TezosWallet)

(def wallet
  (new TezosWallet "edsk4LzAuuQF1FkFHV5qXmpL8a5YNtJh1pTtkAYjAVBKCSAbp6LCCD"
       "edpkvLKtTVPyLsADSVNhZiVxbNYaSvHTU1eCCCygy3GoKcdknpeHwC"
       "tz1RjonN5qEJM8cZhKcfGyoEqhw1FNB4ti6w" "foo"))

(set! Global/defaultProvider "http://granada.newby.org:8732")

(.getBalance wallet)
(.callContractEntryPoint wallet
                         (.getPublicKeyHash wallet)
                         "KT1PptVxoGBiLbtJr2kzXeUsBc2qRAsM7HKS"
                         0M 1500M "100000" "100" "create_token"
                         (into-array ["100", "foo"]) false Global/GENERIC_STANDARD)
