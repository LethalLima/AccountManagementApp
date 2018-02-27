$(document).ready(function () {
    var table = $('#accountsTable').DataTable({
        rowReorder: {
            selector: 'td:nth-child(2)'
        },
        responsive: true,
        'sAjaxSource': '/accounts',
        'sAjaxDataProp': '',
        // "aoColumnDefs": [{ "bSortable": true, "aTargets": [ 1,7 ] } ],
        // 'order': [[ 0, 'asc' ]],
        'aoColumns': [
            {
                'aTargets': [0],
                'bSortable': false,
                // 'mData': 'data',
                'mRender': function (data, type, account) {
                    return '<a href="#" id="edit-' + account.accountNumber + '"' + ' onclick="fnEditAccount(\'' + account.accountNumber + '\')"><span class="glyphicon glyphicon-edit"></span></a>';
                },
                'className': 'text-center'

            },
            {
                'mData': 'accountNumber',
                // 'mRender': function (accountNumber, type, account) {
                //     return '<a href="/account?accountNumber="' + accountNumber + ' id="edit-' + accountNumber + '-page">accountNumber</span></a>';
                // },
            },
            {
                'mData': 'address',
                // 'mRender': function ( address, type, account ) {
                //     return '<span>' + address + '</span>';
                // },
                'fnCreatedCell': function (nCol, address, account, iRow, iCol) {
                    $(nCol).attr('id', 'address-' + account.accountNumber);
                }
            },
            {
                'mData': 'binNotes',
                'fnCreatedCell': function (nCol, binNotes, account, iRow, iCol) {
                    $(nCol).attr('id', 'bin-notes-' + account.accountNumber);
                }
            },
            {'mData': 'attemptOneDate'},
            {'mData': 'attemptTwoDate'},
            {'mData': 'attemptThreeDate'},
            {'mData': 'notes'}
        ],
        // 'fnCreatedRow': function( nRow, aData, iDataIndex ) {
        //     $(nRow).attr('id', 'row-' + aData.accountNumber);
        // }
    });

    // $('#accountsTable').find('a').click( function (event) {
    //     event.preventDefault();
    //     console.log($(this).id);
    // });
});

function fnEditAccount(accountNumber) {
    // var tr = $('#row-' + accountNumber);
    var address = $('#address-' + accountNumber).text();
    console.log(address);

    $('#editAccountDialog').dialog({
        resizable: false,
        autoOpen: false,
        // height: 140,
        // modal: true
    });
}

function fnEditAccountPage(accountNumber) {
    // var tr = $('#row-' + accountNumber);
    var address = $('#address-' + accountNumber).text();
    console.log(address);

    $('#editAccountDialog').dialog({
        resizable: false,
        autoOpen: false,
        // height: 140,
        // modal: true
    });
}
