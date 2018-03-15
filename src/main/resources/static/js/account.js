$(document).ready(function () {
    var table = $('#accountsTable').DataTable({
        // rowReorder: {
        //     selector: 'td:nth-child(2)'
        // },
        responsive: true,
        'ajaxSource': '/account',
        'ajaxDataProp': '',
        // "aoColumnDefs": [{ "bSortable": true, "aTargets": [ 1,7 ] } ],
        // 'order': [[ 0, 'asc' ]],
        'columns': [
            // {
            //     'targets': [0],
            //     'sortable': false,
            //     // 'data': 'data',
            //     'render': function (data, type, account) {
            //         return '<a href="#" id="edit-' + account.accountNumber + '"' + ' onclick="fnEditAccount(\'' + account.accountNumber + '\'); return false;"><span class="glyphicon glyphicon-edit"></span></a>';
            //     },
            //     'className': 'text-center'
            //
            // },
            {
                'data': 'accountNumber',
                'render': function (accountNumber, type, account) {
                    return '<a href="#" id="edit-' + accountNumber + '-page" onclick="fnEditAccount(\'' + accountNumber + '\'); return false;"><span>' + accountNumber + '</span></a>';
                },
                'className': 'text-center'
            },
            {
                'data': 'address',
                // 'render': function ( address, type, account ) {
                //     return '<span>' + address + '</span>';
                // },
                'fnCreatedCell': function (nCol, address, account, iRow, iCol) {
                    $(nCol).attr('id', 'address-' + account.accountNumber);
                }
            },
            {
                'data': 'binNotes',
                'fnCreatedCell': function (nCol, binNotes, account, iRow, iCol) {
                    $(nCol).attr('id', 'bin-notes-' + account.accountNumber);
                }
            },
            {'data': 'attemptOneDate'},
            {'data': 'attemptTwoDate'},
            {'data': 'attemptThreeDate'},
            {'data': 'notes'}
        ],
        'fnCreatedRow': function( nRow, aData, iDataIndex ) {
            $(nRow).attr('id', 'row-' + aData.accountNumber);
        }
    });

    // $('#accountsTable').find('a').click( function (event) {
    //     event.preventDefault();
    //     console.log($(this).id);
    // });

    $('a[name="editAccount"]').on('click', function (event) {
        console.log('It worked!')
    });
});

function fnEditAccount(accountNumber) {
    // var tr = $('#row-' + accountNumber);
    var address = $('#address-' + accountNumber).text();
    // console.log(address);
    //
    // $('#editAccountDialog').dialog({
    //     resizable: false,
    //     autoOpen: false,
    //     // height: 140,
    //     // modal: true
    // });

    $('#accountForm').attr('action', '/account/' + accountNumber).submit();
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
